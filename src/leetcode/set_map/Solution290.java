/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.HashMap;

/**
 *
 * @author kaili
 */
public class Solution290 {

    public static boolean wordPattern(String pattern, String str) {
        char[] patc = pattern.toCharArray();
        String[] strs = str.split(" ");
        if (patc.length != strs.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (!map.containsKey(patc[i])) {
                if (!map.containsValue(strs[i])) {
                    map.put(patc[i], strs[i]);
                } else {
                    return false;
                }
            } else {
                if (!map.get(patc[i]).equals(strs[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}
