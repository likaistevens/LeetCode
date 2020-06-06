/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

/**
 *
 * @author kaili
 */
public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        
        
    }
    
    private int countone(int a){
        char[] c = Integer.toBinaryString(a).toCharArray();
        int count = 0;
        for(char b : c){
            if(b == '1')
                count ++;
        }
        return count;
    }
}
