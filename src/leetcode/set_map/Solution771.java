/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author kaili
 */
public class Solution771 {

    public int numJewelsInStones(String J, String S) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        int num = 0;

        for (int i = 0; i < s.length; i++) {
            if (!map.containsKey(s[i])) {
                map.put(s[i], 1);
            } else {
                map.put(s[i], map.get(s[i]) + 1);
            }
        }

        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
            if (map.keySet().contains(j[i])) {
                num += map.get(j[i]);
            }
        }
        return num;
    }
    
    public int numJewelsInStones2(String J, String S) {
        Set<Character> set = new HashSet<>();
        int num = 0;
        for(char c : J.toCharArray())
            set.add(c);
        for(char c : S.toCharArray())
            if(set.contains(c))
                num ++;
        return num;
    }
    
    

    public static void main(String[] args) {
        Solution771 s = new Solution771();
        System.out.println(s.numJewelsInStones("aA", "aAAbbbb"));
    }
}
