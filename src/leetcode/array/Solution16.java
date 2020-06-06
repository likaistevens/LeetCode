/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author kaili
 */
public class Solution16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int dif = Integer.MAX_VALUE;
        for(int k = 0; k < nums.length - 2; k++){
            int i = k + 1, j = nums.length - 1;
            while(i < j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < target){
                    if(target - sum < dif){
                        dif = target - sum;
                        res = sum;
                    }
                    i ++;
                }else if(sum > target){
                    if(sum - target < dif){
                        dif = sum - target;
                        res = sum;
                    }
                    j --;
                }else{
                    return target;
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args){
        int[] nums = {1,1,1,0};
        System.out.println(threeSumClosest(nums,-100));
    }
}
