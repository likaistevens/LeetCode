/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.other;

/**
 *
 * @author kaili
 */
public class Solution33 {

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
                    int mid = (r - l) / 2 + l;

            if(nums[mid] == target) return mid;
            // 左边有序  注意等于，等于的话也算作有序，不然就会丢失
            if(nums[mid] >= nums[l]){
                // target = nums[l]  要注意这个等于号，左边有序，且恰好nums[l] = target，那么也是要移动r，不然就会丢失。
                if(target < nums[mid] && target >= nums[l]){    // 两个条件组合，四种情况，只有这一种情况是target在左边，所以移动r
                    r = mid - 1;
                }else{   
                    l = mid + 1;
                }
            // 右边有序
            }else if(nums[mid] <= nums[r]){
                if(target > nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
//    public int search(int[] nums, int target) {
//        return searchNum(nums, 0, nums.length - 1, target);
//    }
//
//    int searchNum(int[] nums, int l, int r, int target) {
//        if (l <= r) {
//            int mid = (r - l) / 2 + l;
//            if (nums[mid] == target) {
//                return mid;
//            }
//            
//            // 左边有序
//            if (nums[mid] >= nums[l]) {
//                if (target >= nums[l] && target <= nums[mid]) {
//                    return searchNum(nums, l, mid - 1, target);
//                } else {
//                    return searchNum(nums, mid + 1, r, target);
//                }
//            }
//            // 右边有序
//            if (nums[mid] <= nums[r]) {
//                if (target >= nums[mid] && target <= nums[r]) {
//                    return searchNum(nums, mid + 1, r, target);
//
//                } else {
//                    return searchNum(nums, l, mid - 1, target);
//                }
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
        System.out.println(search(arr, 8));
    }
}
