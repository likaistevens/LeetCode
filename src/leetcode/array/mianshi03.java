/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kaili
 */
public class mianshi03 {
    public int findRepeatNumber(int[] nums) {
        Set s = new HashSet();
        for(int i = 0 ; i < nums.length ; i ++){
            if(!s.contains(nums[i]))
                s.add(nums[i]);
            else
                return nums[i];
        }
        return -1;
    }
}
