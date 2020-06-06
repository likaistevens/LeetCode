/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.DP;

/**
 *
 * @author kaili
 */
public class Solution70 {
    public int climbStairs(int n) {
        if(n ==1 )  return 1;
        int[] memo = new int[n+1];
        memo[1] = 1;
        memo[2] = 2;
        for(int i = 3; i < n+1; i ++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
}
