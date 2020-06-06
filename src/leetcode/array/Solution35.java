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
public class Solution35 {

//    public int searchInsert(int[] nums, int target) {
//        int l = 0;
//        int r = nums.length;
//
//        if (target <= nums[l]) {
//            System.out.println("第一个if");
//            return l;
//        } else if (target > nums[r - 1]) {
//            System.out.println("第二个if");
//            return r;
//
//        } else if (target == nums[r - 1]) {
//            return r - 1;
//        } else {
//            for (int i = l; i < r - l; i++) {
//                if (target > nums[l + i] && target <= nums[l + i + 1]) {
//                    return l + i + 1;
//                }
//            }
//        }
//        return r;
//    }
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int l, int r) {
        int mid = (r + l) / 2; 
        if (r - l < 5) {
            if (target <= nums[l]) {
                System.out.println("第一个if");
                return l;
            } else if (target > nums[r]) {
                System.out.println("第二个if");
                return r + 1;
            } else if (target == nums[r]) {
                return r;
            } else {
                System.out.println("l= " + l + " r= " + r + " mid= " + mid);
                System.out.println("for循环开始");
                for (int i = l; i < r; i++) {
                    if (target > nums[i] && target <= nums[i + 1]) {
                        System.out.println("for执行");
                        System.out.println(nums[i]);
                        return i + 1;
                    }
                }
            }
            return r;
        }
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            System.out.println("递归左边");
            return search(nums, target, l, mid);
        } else {
            System.out.println("递归右边");
            return search(nums, target, mid, r);
        }
    }

    public static void main(String[] args) {
        Solution35 s = new Solution35();
        int[] nums = {2, 4, 5, 6, 7, 8};
        System.out.println(s.searchInsert(nums, 7));
    }

}
