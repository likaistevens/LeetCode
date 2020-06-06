/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.HashSet;

/**
 *
 * @author kaili
 */
public class Solution219 {
    
    
    
    
    
    
    // 
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > k){
                set.remove(nums[i - k - 1]);
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            
            
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums, 2));
    }
}
