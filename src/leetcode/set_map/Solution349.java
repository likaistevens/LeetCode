/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import jdk.nashorn.api.tree.Tree;

/**
 *
 * @author kaili
 */
public class Solution349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> temp = new HashSet<>();
        TreeSet<Integer> res = new TreeSet<>();

        for (int i : nums1) {
            temp.add(i);
        }
        for (int i : nums2) {
            if (temp.contains(i)) {
                res.add(i);
            }
        }
        int[] A = new int[res.size()]; 
        for(int i = 0 ; i < A.length ; i ++){
            A[i] = res.pollLast();
        }
        return A;
    }
    
    public static String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap();
        List<String> res = new LinkedList();
        return res.toArray(new String[res.size()]);
    }
}
