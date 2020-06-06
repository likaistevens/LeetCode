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
public class Solution202 {
    public int getNext(int n){
        int sum = 0;
        int d =0;
        while(n > 0){
            d = n % 10;
            n /= 10;
            sum += d*d;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet sen = new HashSet();
        while(n !=1 && !sen.contains(n)){
            sen.add(n);
            n = getNext(n);
        }
        return sen.contains(n) ? false : true;
    }
}
