/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution93 {
    static List<String> res = new ArrayList<>();
    public static List<String> restoreIpAddresses1(String s) {
        int n = s.length();
        // i 表示第一个小数点在 i号数字之后 。 
        for(int i = 0; i < n - 3; i++){
            for(int j = i + 1; j < n - 2; j++){
                for(int k = j + 1; k < n - 1; k++){
                    if(isAddress(s,0,i) && isAddress(s,i+1,j) && isAddress(s,j+1,k) && isAddress(s,k+1,n-1)){
                        res.add(s.substring(0, i+1)+"."+s.substring(i+1, j+1)+"."+s.substring(j+1, k+1)+"."+s.substring(k+1, n));
                    }
                }
            }
        }
        return res;
    }
    // 判断 s 从l到r是否 0～255之间   包含l 和 r
    public static boolean isAddress(String s, int l, int r) {
        if(r - l == 0)  return true;
        if (l > r || s.charAt(l) == '0') {
            return false;
        }
        if (r - l > 2) {
            return false;
        } else if (r - l < 2) {
            return true;
        } else {
            return Integer.parseInt(s.substring(l, r+1)) < 256;
        }   
    }
    
    public static List<String> restoreIpAddresses(String s){
    
    }
    public static void track_back(String s, int index, String pre){
    
    }
    
    public static void main(String[] args){
        String s = "010010";
//        System.out.println(isAddress(s,3,5));
        System.out.println(restoreIpAddresses(s));
    }
}
