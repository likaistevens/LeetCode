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
public class Solution38 {

    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1 ; i < n ; i ++){
            res = countAndSay(res);
        }
        return res;
    }

    public String countAndSay(String num) {
        char[] ch = num.toCharArray();
        char[] newch = new char[ch.length+1];
        for(int i = 0 ; i < ch.length ; i ++){
            newch[i] = ch[i];
        }
        int b = num.length();
        
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        for(int i = 0 ; i < ch.length; i ++){
            count ++;
            if(newch[i] != newch[i + 1]){
                sb.append(count);
                sb.append(ch[i]);
                count = 0;
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args){
        Solution38 s = new Solution38();
        System.out.println(s.countAndSay(2));
    }
}
