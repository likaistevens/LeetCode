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
public class Solution1013 {

    public static boolean canThreePartsEqualSum(int[] A) {
        int total_sum = 0;
        for (int i = 0; i < A.length; i++) {
            total_sum += A[i];
        }
        int sum = total_sum / 3;

        if (sum * 3 != total_sum) {
            System.out.println("不等于");
            return false;
        }
        int l = 1, r = A.length - 2;
        int lsum = A[0], rsum = A[A.length - 1];
        for (; l < A.length; l++) {
            if (lsum == sum) {
                l--;
                System.out.println("l break");
                break;
            }
            if (lsum != sum) {
                lsum += A[l];
                if (lsum == sum) {
                    System.out.println("l break");
                    break;
                }
            }
        }
        for (; r >= 0; r--) {
            if (rsum == sum) {
                r++;
                System.out.println("r break");
                break;
            }
            if (rsum != sum) {
                rsum += A[r];
                if (rsum == sum) {
                    System.out.println("r break");
                    break;
                }
            }
        }
        return l < r - 1;
    }

    public static void main(String[] args) {
        int[] A = {18, 12, -18, 18, -19, -1, 10, 10};
        System.out.println(canThreePartsEqualSum(A));
    }
}
