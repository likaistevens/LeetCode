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
public class Solution709 {

    public static String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : ch) {
            System.out.println(c);
            if(c < 97 && c > 64){
            
            c = (char) (c + 32);
            
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("al&phaBET"));
        System.out.println('a'+0);
        System.out.println('A'+32);

    }
}
