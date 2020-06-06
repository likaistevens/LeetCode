/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.HashMap;

/**
 *
 * @author kaili
 */
public class Solution525 {

    public static int findMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int[] prefix = new int[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        prefix[0] = 0;
        prefix[1] = nums[0] == 0 ? -1 : 1;
        map.put(prefix[0], 0);
        map.put(prefix[1], 1);
        for (int i = 2; i < nums.length+1; i++) {
            prefix[i] = prefix[i - 1] + (nums[i-1] == 0 ? -1 : 1);
            if (!map.containsKey(prefix[i])) {
                map.put(prefix[i], i);
            } else {
                max = Math.max(i - map.get(prefix[i]), max);
            }
        }
//        return prefix;
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 1, 1, 0}; // 0 -1 0 -1 0 1 2 1
//        for(int i : findMaxLength(nums)){
//            System.out.println(i);
//        }
        System.out.println(findMaxLength(nums));
    }
}
