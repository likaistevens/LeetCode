/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kaili
 */
public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i ++){
            if(!map.keySet().contains(arr[i]))
                map.put(arr[i], 1); 
            else
                map.put(arr[i], map.get(arr[i])+1);

        }
        
        Set s = new HashSet();
        for(int num : map.values()){
            if(!s.contains(num))
                s.add(num);
            else
                return false;
        }
        return true;
    }
}
