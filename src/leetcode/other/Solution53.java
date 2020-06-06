//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//示例:
//输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
package leetcode.other;

/**
 *
 * @author kaili
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] sum = new int[len + 1];
        sum[0] = nums[0];
        for(int i = 1 ; i < len ; i ++){
            sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
        }
        int max = sum[0];
        for(int i = 0 ; i < sum.length - 1 ; i ++){
            max = Math.max(sum[i], max);
        }
        return max;
    }
    //用动态数组存储每一次考虑新出现的数nums[i]后的最大值。
    //然后循环这个动态数组，获取其中最大的
    
    public int maxSubArray2(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i ++){
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(sum, max);
        }
        
        return max;
    }
    //循环统计之前的现在的nums[i]加上之前的sum是变大还是变小，如果变小了，就不要加sum，让sum等于当前数
    //然后判断上一轮的最大值与现在的sum谁大，如果之前的max大，就表示不要考虑最后新出现的这个数，结果反而会大一些。
    public static void main(String[] args){
        Solution53 s = new Solution53();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray2(arr));
    }
    
}
