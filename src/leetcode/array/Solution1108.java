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
public class Solution1108 {
    public String defangIPaddr(String address) {
        char[] ch = address.toCharArray();
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < ch.length ; i ++){
            if(ch[i] == '.')
                res.append("[.]");
            else
                res.append(ch[i]);
        }
        return res.toString();
    }
}
