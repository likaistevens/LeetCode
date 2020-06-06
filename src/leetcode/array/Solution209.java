/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

/**
 *
 * @author kaili
 */
public class Solution209 {

    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null)    return 0;
        int i = 0;
        int j = 0;
        if(nums[0] >= s)    return 1;
        int len = Integer.MAX_VALUE;
        while (j < nums.length) {
            if (sum(nums,i,j) < s) {
                j ++;
            } 
            else {
                len = Math.min(len, j - i + 1);
                i ++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }

    private int sum(int[] nums, int i, int j) {
        int sum = 0;
        for (; i <= j; i++) {
            sum += nums[i];
        }
        return sum;
    }
    
    public static void main(String[] args){
        Solution209 s = new Solution209();
        int[] nums = {2,3,1,2,4,3};
        System.out.println(s.minSubArrayLen(7, nums));
    }
}
