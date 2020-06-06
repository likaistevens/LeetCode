/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.Hash;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kaili
 */
public class Solution575 {
    public int distributeCandies(int[] candies) {
        Set s = new HashSet();
        for(int i : candies)
            s.add(i);
        return Math.min(s.size(), candies.length/2);
    }
}
