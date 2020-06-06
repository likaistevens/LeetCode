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
public class Solution867 {
    public static int[][] transpose(int[][] A) {
        int[][] ret = new int[A[0].length][A.length];
        for(int i = 0 ; i <  A[0].length; i ++){
            for(int j = 0 ; j < A.length ; j ++){
                System.out.println("ret["+i+"]["+j+"]"+"A["+j+"]["+i+"]");
                ret[i][j] = A[j][i];
            }
        }
        return ret;
    }
    
    public static void main(String[] args){
        int[][] A = {{1,2,3},{4,5,6}};
                int[][] B = {{1,2},{3,4},{5,6}};

        System.out.println(transpose(A));
        
    }
}
