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
public class Solution11 {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = Math.min(height[i], height[j]) * (j - i);
        while (true) {
            if (i <= height.length && height[i] <= height[j]) {
                                i++;

                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
            if (j >= 0 && height[i] > height[j]) {
                                j--;

                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
            if (i >= j) {
                break;
            }
            //max = Math.max(max, Math.min(height[i], height[j]) * (j - i));

        }
        return max;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(s.maxArea(arr));
    }
}
