/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.HashMap;

/**
 *
 * @author kaili
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] res = new int[2];
        while(i < j){
            if(numbers[i] + numbers[j] < target){
                i ++;
            }else if(numbers[i] + numbers[j] > target){
                j --;
            }else{
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
        }
        return res;
    }
    
    public static void main(String[] args){
        Solution167 s = new Solution167();
        int[] nums = {2,7,11,15};
        s.twoSum(nums, 9);
    }
}
