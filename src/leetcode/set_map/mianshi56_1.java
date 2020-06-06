/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author kaili
 */
public class mianshi56_1 {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>(); 
        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                set.remove(i);
            }
        }
        int index = 0;
        for(int i : set){
           res[index] = i;
           index ++;
        }
        return res;
    }
}
