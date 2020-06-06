package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] newnums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newnums[i] = nums[i];
        }
        Arrays.sort(nums);
        
        for(int i : nums)
            System.out.println(i);
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) 
                map.put(nums[i], i);
            
        }
        for (int i = 0; i < nums.length; i++) {
            newnums[i] = map.get(newnums[i]);
        }
        return newnums;

    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3,3, 2, 1, 0};
//        int[] newnums = nums;
//        Arrays.sort(nums);
//        for (int t : nums) {
//            System.out.print(t);
//        }


//        System.out.println();
//
//        for (int t : newnums) {
//            System.out.print(t);
//        }

    for(int i : smallerNumbersThanCurrent(nums))
        System.out.print("*****" + i);
    }
}
