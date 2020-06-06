//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
//示例 1:
//输入: coins = [1, 2, 5], amount = 11
//输出: 3 
//解释: 11 = 5 + 5 + 1
//示例 2:
//输入: coins = [2], amount = 3
//输出: -1
package leetcode.other;

import java.util.Arrays;

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] sortcoin = coins;
        int[] f = new int[amount + 1];
        coinChange(f, sortcoin, amount);
        
        return f[amount];
    }
    
    public int coinChange(int[] f, int[] coins, int amount) {
        for(int i = coins.length - 1 ; i > 0 ; i --){
            if(coins[i] == amount)
                return 1;
        }
            
        for(int i = amount ; i > 0 ; i --){
            System.out.print("i>0");
            if(f[i] == 0){
                System.out.println("f["+ i + "]=0");
                for(int j = coins.length -1 ; j >= 0 ; j --){
                    if(amount >= coins[j]){
                        f[i] = coinChange(coins,amount - coins[j]) + 1;
                        System.out.println("f["+ i + "]" + f[1]);
                    }
                }
            }
        }
        
        return f[amount];
    }
    
    
    
    public static void main(String[] args){
        Solution322 s = new Solution322();
        int[] coins = {1,2,5};
        System.out.println(s.coinChange(coins,10)); 
    }
}
