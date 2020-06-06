/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.HashSet;

/**
 *
 * @author kaili
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                return false;
            }
        }
        return true;
    }
}
