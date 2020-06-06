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
public class Solution66 {

    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1 ; i >= 0 ; i -- ){
            digits[i] ++;
            digits[i] %= 10;
            if(digits[i] != 0)  return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
