/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author kaili
 */
public class Solution41 {

    public static int firstMissingPositive(int[] nums) {
        boolean one = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one = true;
            }
            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = 1;
            }
        }
        
        if (!one || nums.length == 0) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            nums[Math.abs(a) - 1] = -Math.abs(nums[Math.abs(a) - 1]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;   
            }
        }
        return nums.length + 1;
    }

    public static int firstMissingPositive2(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        Arrays.sort(nums);
        if (nums[nums.length - 1] < 1) {
            return 1;
        }
        int i = 0;
        while (nums[i] <= 0) {
            i++;
        }
        if (nums[i] > 1) {
            return 1;
        }
        for (; i < nums.length - 1; i++) {
            if (nums[i] >= 0 && nums[i + 1] >= 0 && nums[i + 1] > nums[i] + 1) {
                return nums[i] + 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1000};
        System.out.println(firstMissingPositive1(nums));
    }
}
