/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.backtrack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution216 {
    List<List<Integer>> res;
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        res = new ArrayList<>();
        if(k > n)   return res;
        
        back_track(k, n, n, 1, 0, new LinkedList<>());
        return res;
    }
    void back_track(int k, int n,int remain, int begin, int index, Deque<Integer> list){
        if(index == k && remain == 0){
            res.add(new LinkedList<>(list));
            return;
        }
        for(int i = begin; i <= 9; i++){
            list.add(i);
            back_track(k, n, remain - i, i+1, index +1, list);
            list.removeLast();
        }
    }
    public static void main(String[] args){
        Solution216 s = new Solution216();
        int k = 3;
        int n = 7;
        System.out.println(s.combinationSum3(k, n));
    }
}
