/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution387 {
    public static int firstUniqChar(String s) {
        int[] st = new int[26];
        for(int i = 0 ; i < s.length() ; i ++){
            st[s.charAt(i)-97] += 1;
        }
        for(int i = 0 ; i < s.length() ; i ++){
            if(st[s.charAt(i)-97] == 1)
             return i;
        }
        return -1;
    }
    
    public static void main(String[] args){
        System.out.println(firstUniqChar("leetcode"));
    }
}
