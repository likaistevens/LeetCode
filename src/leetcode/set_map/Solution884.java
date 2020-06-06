/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author kaili
 */
public class Solution884 {

    public static String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap();
        List<String> res = new LinkedList();
        String c = A + " " + B;
        String[] cset = c.split(" ");
        for (String tempc : cset) {
            if (!map.containsKey(tempc)) {
                map.put(tempc, 1);
            } else {
                map.put(tempc, map.get(tempc) + 1);
            }
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                res.add(key);
            }
        }
        return res.toArray(new String[res.size()]);
    }
    
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        String c = A + " " + B;
        for (String t : uncommonFromSentences(A,B)) {
            System.out.println(t);
        }

    }
}
