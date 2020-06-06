/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution47 {
//    static HashSet<List<Integer>> resSet = new HashSet<>();
//    static List<List<Integer>> res = new ArrayList<>();
//    static HashMap<Integer,Integer> used = new HashMap<>();
//    public static List<List<Integer>> permuteUnique(int[] nums) {
//        if(nums.length == 0)    return res;
//        
//        for(int i = 0; i < nums.length; i++){
//            if(!used.containsKey(nums[i])){
//                used.put(nums[i], 1);
//                
//            }else{
//                used.put(nums[i], used.get(nums[i])+1);
//            }
//        }
//        List<Integer> list = new ArrayList<>();
//        generate(nums,0,list);
//        for(List l : resSet){
//            res.add(l);
//        }
//        return res;
//    }
//    public static void generate(int[] nums, int index, List list){
//        if(index == nums.length){
//            resSet.add(new ArrayList(list));
//        }
//        for(int i = 0; i < nums.length; i++){
//            if(used.get(nums[i]) > 0){
//                used.put(nums[i],used.get(nums[i])-1);
//                list.add(nums[i]);
//                generate(nums,index + 1, list);
//                list.remove(list.size()-1);
//                used.put(nums[i],used.get(nums[i])+1);
//            }
//        }
//    }
    
    static List<List<Integer>> res = new ArrayList<>();
    static HashMap<Integer,Integer> used = new HashMap<>();
    static HashSet<Integer> numsSet = new HashSet();
    public static List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length == 0)    return res;
        
        for(int i = 0; i < nums.length; i++){
            if(!used.containsKey(nums[i])){
                used.put(nums[i], 1);
            }else{
                used.put(nums[i], used.get(nums[i])+1);
            }
            numsSet.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        generate(nums,0,list);
        return res;
    }
    public static void generate(int[] nums, int index, List list){
        if(index == nums.length){
            res.add(new ArrayList(list));
        }
        for(int i : numsSet){
            if(used.get(i) > 0){
                used.put(i,used.get(i)-1);
                list.add(i);
                generate(nums,index + 1, list);
                list.remove(list.size()-1);
                used.put(i,used.get(i)+1);
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {1,1,2};
        System.out.println(permuteUnique(nums));
    }
}
