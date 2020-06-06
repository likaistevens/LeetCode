/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author kaili
 */
public class Solution1078 {

    public String[] findOcurrences(String text, String first, String second) {
        String[] s = text.split(" ");
//        for(String r : s)
//                System.out.println(r);
        Queue res = new LinkedList();
        for (int i = 0; i < s.length - 2; i++) {
            System.out.println(s[i].equals(first));
            if (s[i].equals(first) && s[i + 1].equals(second)) {
                res.add(s[i + 2]);
            }
        }
        String[] ret = new String[res.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = res.poll() + "";
        }
        return ret;
    }
    public static void main(String[] args){
        Solution1078 s = new Solution1078();
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
        for(String g : s.findOcurrences(text, first, second))
            System.out.println(g);

    }
}
