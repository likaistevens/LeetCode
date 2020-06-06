/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.Arrays;

/**
 *
 * @author kaili
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }
    public static void main(String[] args) {
        Solution169 s = new Solution169();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(s.majorityElement(nums));
    }
}
