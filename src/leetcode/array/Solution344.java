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
public class Solution344 {
     public void reverseString(char[] s) {
         char c = ' ';
         for(int i = 0 ; i <= s.length/2 ; i ++){
             c = s[i];
             s[i] = s[s.length-1-i];
             s[s.length-1-i] = c;
         }
    }
}
