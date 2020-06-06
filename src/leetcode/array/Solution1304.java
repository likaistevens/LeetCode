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
public class Solution1304 {

    public int[] sumZero(int n) {
        int[] array = new int[n];
        array[0] = -(n / 2);

        if (n % 2 == 0) {
            for (int i = 1; i < n; i++) {
                if (array[i - 1] == -1) {
                    array[i] = array[i - 1] + 2;
                } else {
                    array[i] = array[i - 1] + 1;
                }
            }
        } else {
            for (int i = 1; i < n; i++) {

                array[i] = array[i - 1] + 1;
            }
        }

        return array;
    }
}
