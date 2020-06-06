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
public class Solution258 {
    public static int addDigits(int num) {
        if(num < 10)    return num;
        
        int newnum = 0;
        String s = num + "";
        for(int i = 0 ; i < s.length() ; i ++){
            newnum += Integer.parseInt(s.charAt(i)+"");
        }
        return addDigits(newnum);
    }
    
    public static void main(String[] args){
        System.out.println(addDigits(99));
    }
}
