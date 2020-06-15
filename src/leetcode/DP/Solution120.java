/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.DP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution120 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m).size();
        int[][] dp = new int[m][n];
        dp[0][0] = triangle.get(0).get(0);
        for(int i = 1; i < m; i++){
            List<Integer> temp = triangle.get(i);
            for(int j = 0; j < i; j++){
                int[] pre = dp[i-1];
                int min = 0;
                if(j == 0){
                    min = temp.get(0) + pre[0];
                }else if(j == temp.size() - 1){
                    min = temp.get(j) + pre[j-1];
                }else{
                    min = Math.min(temp.get(j) + pre[j], temp.get(j) + pre[j-1]); 
                }
                dp[i][j] = min;
            }
        }
        int res = Integer.MAX_VALUE;
        
        for(int i : dp[m-1]){
            res = Math.min(res, i);
        }
        return res;
    }
    public static void main(String[] args){
//        List<List<Integer>> triangle = new ArrayList<>();
//        List<Integer> one = new
//        triangle.add(e)[[2],[3,4],[6,5,7],[4,1,8,3]]
    }
}
