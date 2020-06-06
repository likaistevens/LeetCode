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
public class Solution905 {

    public static int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i <= j) {
            System.out.println(i + " 。 " + j);
            if (A[i] % 2 != 0 && A[j] % 2 == 0) {
                System.out.println("i= " + i + " j= " + j + "第一个if " + A[i] + " " + A[j]);
                swipe(A, i, j);
                i++;
                j--;
            } else if (A[i] % 2 != 0 && A[j] % 2 != 0) {
                System.out.println("i= " + i + " j= " + j + "第二个if " + A[i] + " " + A[j]);
                j--;
            } else if (A[i] % 2 == 0 && A[j] % 2 == 0) {
                System.out.println("i= " + i + " j= " + j + "第三个if " + A[i] + " " + A[j]);
                i++;
            } else if (A[i] % 2 == 0 && A[j] % 2 != 0) {
                System.out.println("i= " + i + " j= " + j + "第三个if " + A[i] + " " + A[j]);
                i++;
                j--;
            }
        }
        return A;
    }

    public int[] sortArrayByParity2(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            while (A[i] % 2 == 0 && i < j) {
                i++;
            }
            while (A[j] % 2 == 1 && i < j) {
                j--;
            }
            int temp = A[i];
            A[i++] = A[j];
            A[j--] = temp;
        }
        return A;
    }

    private static void swipe(int[] e, int i, int j) {
        int temp = e[i];
        e[i] = e[j];
        e[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 2};
        sortArrayByParity(A);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
