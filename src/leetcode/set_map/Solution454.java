/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : C){
            for(int j : D){
                map.put(i+j, 1);
            }
        }
        for(int i : A){
            for(int j : B){
                if(map.containsKey(0-i-j)){
                    res += map.get(0-i-j);
                }   
            }
        }
        return res;
    }
}
