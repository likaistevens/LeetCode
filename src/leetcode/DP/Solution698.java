/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.DP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution698 {
    static HashSet<Integer> indexSet = new HashSet();
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            indexSet.add(i);
            sum += i;
        }
        if(sum % k != 0)    return false;
        
        
    }
    static boolean search(int[] nums, int l, int r, int target){
        if(target == 0) return true;
        for(int i : indexSet){
            indexSet.remove(i);
            search(nums, target - nums[i]);
        }
        return false;
    } 
    public static void main(String[] args){
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        for(int i = 0; i < nums.length; i++)
            indexSet.add(i);
        System.out.println(search(nums, 5));
    }
}
