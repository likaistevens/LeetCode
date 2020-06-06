/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String s : strs){
            String sorted = sortString(s);
            if(!map.containsKey(sorted)){
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted,list);
            }else{
                map.get(sorted).add(s);
            }
        }
        
        for(List l : map.values()){
            res.add(l);
        }
        return res;
    }
    
    public static String sortString(String s){
        ArrayList<Character> list = new ArrayList();
        for(char c : s.toCharArray()){
            list.add(c);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(char c : list){
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static void main(String[] args){
        String s = "eat";
        
        String[] st = {"c","a","b"};
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char c : ch){
            System.out.println(c);
        }
        
    }
}
