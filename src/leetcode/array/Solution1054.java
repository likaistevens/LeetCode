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
public class Solution1054 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        while (n > 0) {
            if (m <= 0) {
                nums1[i] = nums2[n - 1];
                i--;
                n--;
            } else if ((nums1[m - 1] < nums2[n - 1])) {
                nums1[i] = nums2[n - 1];
                i--;
                n--;
            } else {
                nums1[i] = nums1[m - 1];
                i--;
                m--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0};
        int m = 0;
        int[] nums2 = {1, 2};
        int n = 2;

        merge(nums1, m, nums2, n);

        for (int i : nums1) {
            System.out.print(i + " ");
        }
//        for (int i : nums2) {
//            System.out.print(i + " ");
//        }
    }
}
