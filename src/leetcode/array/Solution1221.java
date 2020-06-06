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
public class Solution1221 {
    public int balancedStringSplit(String s) {
        char[] ch = s.toCharArray();
        int flag = 0 , count = 0;
        char first = ch[0];
        for(int i = 0 ; i < ch.length ; i ++){
            if(ch[i] == first)
                flag ++;
            else
                flag --;
            if(flag == 0)
                count ++;
        }
        return count;
    }
}
