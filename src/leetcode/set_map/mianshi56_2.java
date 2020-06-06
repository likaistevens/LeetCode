/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.HashMap;

/**
 *
 * @author kaili
 */
public class mianshi56_2 {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], false);
            }else{
                map.put(nums[i], true);
            }
        }
        for(int i : map.keySet()){
            if(!map.get(i)){
                return i;
            }
        }
        return -1;
    }
}
