package leetcode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution39 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0)  return res;
        Arrays.sort(candidates);
        generate(candidates, 0,target,new ArrayList());
        return res;
    }
    
    public void generate(int[] candidates,int begin, int target, List list){
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        // 这里从begin开始操作。   比如 2， 3， 5。   第一层循环i=0，从2 开始，2找完了，第一层循环i=1，从3开始，此时 不需要再回头看2。 
        // 换句话说，已经找过 2了，以后所有的分支序列，里面不需要有2，因为 早就在i=0，2开始的那一次循环中找完了。
        // 即，例如 。i=0  ： 2 2 3  已经找过了，   i=1： 3 2 2   又会重复。   直接从3 3 3开始找 不能包含2
        for(int i = begin; i < candidates.length; i++){
            // 剪枝操作
            if(target - candidates[i] < 0)  
                return;
            list.add(candidates[i]);
            generate(candidates,i,target - candidates[i],list);
            list.remove(list.size() - 1);
        }
    }
    
    
    
//    List<List<Integer>> res = new ArrayList<>();
//    Stack<List> stack = new Stack<>();
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        if(candidates.length == 0)  return res;
//        Arrays.sort(candidates);
//        generate(candidates,target,new ArrayList());
//        return res;
//    }
//    
//    public void generate(int[] candidates,int target, List list){
//        System.out.println(target + " 。 "  + list);
//        if(target < 0) return;
//        if(target == 0){
//            ArrayList<Integer> temp = new ArrayList<>(list);
////            Collections.sort(temp);
////            if(!stack.contains(temp)){
////                stack.add(temp);
//                res.add(temp);
////            }
//            return;
//        }
//        for(int i = 0 ;i < candidates.length; i++){
//            // 剪枝操作
////            if(target - candidates[i] < 0)  
////                return;
//            list.add(candidates[i]);
//
//            generate(candidates,target - candidates[i],list);
//            list.remove(list.size() - 1);
//        }
//    }
    public static void main(String[] args){
        Solution39 s = new Solution39();
        int[] candidates = {5,3,2};
        int target = 8;
        System.out.println(s.combinationSum(candidates, target));
    }
}
