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
public class Solution64 {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int j = 1; j < m; j++){
            grid[j][0] = grid[j][0] + grid[j-1][0];
        }
        for(int j = 1; j < n; j++){
            grid[0][j] = grid[0][j] + grid[0][j-1];
        }
        System.out.println("-");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                grid[i][j] = Math.min(grid[i][j] + grid[i][j-1], grid[i][j] + grid[i-1][j]);
            }
        }
        return grid[m-1][n-1];
    }
    public static void main(String[] args){
        int[][] grid = {{9,1,4,8}};
        
//        int[][] grid = {{1,2},{5,6},{1,1}};
//        int[][] grid = {{1,2,5},{3,2,1}};
        System.out.println(minPathSum(grid));
    }
}
