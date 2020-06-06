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
public class mianshi17 {

    public int[] printNumbers(int n) {
        StringBuilder max = new StringBuilder();
        for (int i = 0; i < n; i++) {
            max.append(9);
        }
        int num = Integer.valueOf(max.toString());
        int[] res = new int[num];

        for (int i = 1; i <= num; i++) {
            res[i-1] = i;
        }
        return res;
    }
}
