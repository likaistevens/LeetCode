/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kaili
 */
public class Solution242 {

    public boolean isAnagram(String s, String t) {
        if (s.equals("") && t.equals("")) {
            return true;
        }
        if (s.equals("") || t.equals("")) {
            return false;
        }
        List<Character> ss = new LinkedList<>();
        List<Character> tt = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            ss.add(s.charAt(i));
        }
        for(int i = 0 ; i < t.length() ; i ++){
            tt.add(t.charAt(i));
        }
        for(Object c : ss){
            if(tt.contains(c))
                tt.remove(c);
            else
                return false;
        }
        return tt.isEmpty();
    }
    
    public boolean isAnagram2(String s,String t){
        if(s.length() != t.length())    return false;
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i)-'a'] ++;
            counter[t.charAt(i)-'a'] --;
        }
        for(int i = 0 ; i < counter.length ; i ++){
            if(counter[i] != 0)
                return false;
        }
        return true;
    }
}
