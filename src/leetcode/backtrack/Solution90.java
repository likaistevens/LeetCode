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

// 同 78 。 加入了 。if(i > begin && nums[i] == nums[i-1])  continue;  来防止遍历重复元素
                
public class Solution90 {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
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
            if(i > begin && nums[i] == nums[i-1])
                continue;
            list.add(nums[i]);

            res.add(new ArrayList<>(list));
            // 注意递归的时候 begin是从 i+1 。而不是begin+1
            back_track(nums, i + 1, list);
            list.removeLast();
        }
    }
}
