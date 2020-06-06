/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution18 {

    // leetcode15 tree sum 多加一层循环 双指针对撞
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int s = 0; s < nums.length - 3; s++){
            for (int k = s + 1 ; k < nums.length - 2; k++) {
                    int i = k + 1, j = nums.length - 1;
            while (i < j) {
                if (nums[s] + nums[k] + nums[i] + nums[j] < target) {
                    i++;
                } else if (nums[s] + nums[k] + nums[i] + nums[j] > target) {
                    j--;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[s]);
                    temp.add(nums[k]);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    if (!set.contains(temp)) {
                        set.add(temp);
                        res.add(temp);
                    }
                    i++;
                    j--;
                }
            }
            }
        }
        

        return res;

    }

}
