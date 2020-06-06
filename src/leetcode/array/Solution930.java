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
public class Solution930 {

    public static int numSubarraysWithSum(int[] A, int S) {
        int[] sum = new int[A.length+1];
        int count = 0;
        sum[0] = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
//        if(A[0] == 0 && S == 0) count ++;
        map.put(0, 1);
        for(int i = 0; i < A.length; i++ ){
            sum[i + 1] = sum[i] + A[i];
            if(map.containsKey(sum[i+1] - S)){
                count += map.get(sum[i+1] - S);
            }
            if(!map.containsKey(sum[i+1])){
                map.put(sum[i+1], 1);
            }else{
                map.put(sum[i+1], map.get(sum[i+1])+1);
            }
            
        }
        for(int i : sum){
        System.out.print(i+" ");
        }
        System.out.println(map.get(0));
        
        return count;
    }
    
    public static void main(String[] args){
        int[] A = {1,0,1,0,1};
        //        0,0,0,0,0,0
//        int[] A = {0,0,1,0,1,0,0,1,1,0};   
//                0,0,0,1,1,2,2,2,3,4,4
        int S = 2;
        System.out.println(numSubarraysWithSum(A,S));
    }
}
