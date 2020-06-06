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
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        // s是t的子序列
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int i = 0;
        int j = 0;
        while(j <= tc.length){
            if(i >= sc.length)  return true;
            if(j == tc.length)  return false;
            if(sc[i] == tc[j]){
                j ++;
                i ++;
            }else{
                j ++;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Solution392 s = new Solution392();
                        System.out.println(s.isSubsequence("","ahbgdc"));

                System.out.println(s.isSubsequence("abc","ahbgdc"));

        //System.out.println(s.isSubsequence("axc","ahbgdc"));
    }
}
