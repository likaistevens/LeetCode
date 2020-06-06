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
public class Solution1295 {
    public int findNumbers(int[] nums) {
        int len = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if((nums[i]+"").length()%2 == 0 ){
                len ++;
            }
        }
        return len;
    }
}
