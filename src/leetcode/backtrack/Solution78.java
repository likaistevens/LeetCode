/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution78 {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        res.add(new ArrayList());
        if(nums.length == 0)    return res;
        Arrays.sort(nums);
        back_track(nums, 0, new LinkedList<>());
        return res;
    }
    void back_track(int[] nums, int begin, Deque<Integer> list){
        if(list.size() > nums.length){
            return;
        }
        for(int i = begin; i < nums.length; i++){
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            back_track(nums, i + 1, list);
            list.removeLast();
        }
    }
    public static void main(String[] args){
        Solution78 s = new Solution78();
        int[] nums = {1,2,2};
        System.out.println(s.subsets(nums));
    }
}
