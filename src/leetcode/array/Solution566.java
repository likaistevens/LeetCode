/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.LinkedList;

/**
 *
 * @author kaili
 */
public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c) return nums;
        
        int[][] newnum = new int[r][c];
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = 0 ; j < nums[0].length ; j ++){
                list.add(nums[i][j]);
            }
        }
        
        for(int i = 0 ; i < r ; i ++){
            for(int j = 0 ; j < c ; j ++){
                newnum[i][j] = list.removeFirst();
            }
        }
        
        return newnum;
    }
}
