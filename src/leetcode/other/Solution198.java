//你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
//给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
//示例 1:
//输入: [1,2,3,1]
//输出: 4
//解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
//     偷窃到的最高金额 = 1 + 3 = 4 。
package leetcode.other;

/**
 *
 * @author kaili
 */
public class Solution198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int[] sum = new int[len + 1];
        sum[0] = nums[0];
        if(len == 1)  return sum[0];
        sum[1] = Math.max(nums[0],nums[1]);
        if(len == 2)  return sum[1];
        for(int i = 2 ; i < len ; i ++){
            sum[i] = Math.max(sum[i-2]+nums[i], sum[i-1]);
        }
        return sum[len - 1];
    }
    public static void main(String[] args){
        Solution198 s = new Solution198();
        int[] arr = {1,2,3,1};
        System.out.println(s.rob(arr));
    }
}