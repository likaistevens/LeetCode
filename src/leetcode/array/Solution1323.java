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
public class Solution1323 {
    public int maximum69Number (int num) {
        char[] ch = (num+"").toCharArray();
        for(int i = 0 ; i < ch.length ; i ++){
            if(ch[i] != '6'){
                ch[i] = '9';}
        }
        StringBuilder sb = new StringBuilder();
        for(char c : ch)
            sb.append(c);
        return Integer.parseInt(sb.toString());
    }
}
