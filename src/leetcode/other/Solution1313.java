//给你一个以行程长度编码压缩的整数列表 nums 。
//考虑每对相邻的两个元素 [a, b] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后有 a 个值为 b 的元素。
//请你返回解压后的列表。
package leetcode.other;

public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length ; i += 2){
            len += nums[i];
        }
        int[] ret = new int[len];
        int count = 0;
        
        for(int i =0 ; i < nums.length ; i += 2){
            for(int j = 0 ; j < nums[i] ; j ++){
                ret[count] = nums[i + 1];
                count ++;
            }
        }
    return ret;        
    }
}
