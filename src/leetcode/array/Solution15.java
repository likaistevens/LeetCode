package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kaili
 */
public class Solution15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Set<List> set = new HashSet();
        Arrays.sort(nums);
        for (int i = 2; i < nums.length; i++) {
            HashSet<Integer> sett = new HashSet<>();
            for (int m = 0; m < i; m++) {
                if (sett.contains(0 - nums[i] - nums[m])) {
                    List<Integer> three = new ArrayList();
                    three.add(0 - nums[i] - nums[m]);
                    three.add(nums[m]);
                    three.add(nums[i]);
//                    Collections.sort(three);
                    if (!set.contains(three)) {
                        set.add(three);
                        res.add(three);
                    }
                }
                sett.add(nums[m]);
            }
        }
        return res;
    }

    public static List<List<Integer>> threeSum3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        Set<List> set = new HashSet();
        for (int k = 0; k < nums.length - 2; k++) {
            int i = k + 1, j = nums.length - 1;
            System.out.println("i"+i+" j"+j);
            while (i < j) {
                if (nums[i] + nums[j] + nums[k] < 0) {
                    i++;
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    j--;
                } else {
                    System.out.println("else");
                    List<Integer> three = new ArrayList();
                    three.add(nums[i]);
                    three.add(nums[j]);
                    three.add(nums[k]);
                    if (!set.contains(three)) {
                        set.add(three);
                        res.add(three);
                    }
                    i ++;
                    j --;
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Set<List> set = new HashSet();

        for (int i = 2; i < nums.length; i++) {
            List<int[]> two = twoSum(nums, 0 - nums[i], i);
            for (int[] j : two) {
                j[2] = nums[i];
                List temp = new LinkedList();
                for (int t : j) {
                    temp.add(t);
                }
                Collections.sort(temp);
                set.add(temp);
            }
        }
        for (List j : set) {
            res.add(j);
        }
        return res;
    }

    public static List<int[]> twoSum(int[] nums, int target, int end) {
        // end 最大 nums.lenghth  [0... nums.length)
        HashSet<Integer> set = new HashSet<>();
        List<int[]> res = new LinkedList<>();
        for (int i = 0; i < end; i++) {
            if (set.contains(target - nums[i])) {
                int[] two = {target - nums[i], nums[i], 0};
                res.add(two);
            }
            set.add(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        Set<List> set = new HashSet();
        for (List j : threeSum3(nums)) {
            Collections.sort(j);
            set.add(j);
            for (List m : set) {
                System.out.println(m);
            }
        }

        System.out.println("-----------");

//        for (int[] j : twoSum(nums, 1, nums.length - 1)) {
//            for (Object i : j) {
//                System.out.print(i.toString() + " ");
//            }
//            System.out.println();
//        }
    }

}
