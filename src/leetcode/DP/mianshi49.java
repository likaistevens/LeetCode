/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.DP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author kaili
 */
public class mianshi49 {
    
    public static int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int a=0, b=0, c=0;
        dp[0] = 1;
        for(int i = 1; i < n; i ++){
            dp[i] = Math.min(Math.min(dp[a]*2, dp[b]*3), dp[c]*5);
            if(dp[a]*2==dp[i]){
                a ++;
            }
            if(dp[b]*3==dp[i]){
                b ++;
            }
            if(dp[c]*5==dp[i]){
                c ++;
            }
        }
        return dp[n-1];
    }
    
    // 这个动态规划超时了 。 原因  % 特别消耗性能
    public static int nthUglyNumber2(int n) {
        HashSet<Integer> set = new HashSet();
        if(n == 1)  return 1;
        set.add(1);
        int res = 0;
        int i = 1;
        while (set.size() < n) {
            res = i;
            int temp = i;
            
            int a=0, b=0, c=0;
            
            while(true){
                if(temp == 0 || set.contains(temp)){
                    if(! (i == 1)){
                        set.add(i);
                    }
                    break;
                }else if (temp % 2 == 0) {
                    temp /= 2;
                } else if (temp % 3 == 0) {
                    temp /= 3;
                } else if (temp % 5 == 0) {
                    temp /= 5;
                }else{
                    break;
                }
            }
            i ++;
        }
        return res;
    }
    
    public static void main(String[] args){
//        for(int i = 1; i < 10; i ++){
        System.out.print(nthUglyNumber(10) + " ");
//        }
    }
}
