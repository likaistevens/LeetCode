/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kaili
 */
public class Solution40 {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        if(candidates.length == 0)  return res;
        Arrays.sort(candidates);
        back_track(candidates, target, 0, new LinkedList<Integer>());
        return res;
    }
    void back_track (int[] candidates, int target, int begin, Deque list){
        System.out.println(list);
        if(target == 0){
            res.add(new LinkedList(list));
            return;
        }
        for(int i = begin; i < candidates.length; i++){
            // 大剪枝
            if(target - candidates[i] < 0)  return;
            // 小剪枝 。  来自参考答案
            // i > begin是确保 下标 i-1 之后，仍在我们检索范围内。   也就是说 candidates[i]和 candidates[i-1] 必须都是在 candidates[begin] - candidates[candidate.length]范围内
            if (i > begin && candidates[i] == candidates[i - 1]) {
                // 这里如果是break就会结束整个循环，即第一层大循环结束。  然后差不多相当于整个back——track结束了。  
                // continue跳过下面的三行操作，继续for循环。
                continue;
            }
            list.add(candidates[i]);
            // 区别于39题 。不能重复，所以 begin要从i+1开始，   来自参考答案
            back_track(candidates, target - candidates[i], i+1, list);
            list.removeLast();
        }
    }
    public static void main(String[] args){
        Solution40 s = new Solution40();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(s.combinationSum2(candidates, target));
    }
}
