/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.backtrack;

/**
 *
 * @author kaili
 */
public class Solution200 {
//    int[][] d = {{0,1},{1,0},{0,-1},{-1,0}};
//    boolean[][] used;
//    int count = 0;
//    int m, n;
//    int p, q;
//    public int numIslands(char[][] grid) {
//        if(grid.length == 0) return count;
//        m = grid.length;
//        n = grid[0].length;
//        used = new boolean[m][n];
//        
//        for(int p = 0; p < m; p++){
//            for(int q = 0; q < n; q++){
//                if(!used[p][q] && grid[p][q] == '1'){
//                    count ++;
//                    search(grid, 0, p, q);
//                }
//            }
//        }
//        return count;
//    }
//    void search(char[][] grid, int index, int startx, int starty){
//        System.out.println(startx + "，" + starty);
//        used[startx][starty] = true;
//        for(int i = 0; i < 4; i++){
//            int newx = startx + d[i][0];
//            int newy = starty + d[i][1];
//            if(inArea(newx, newy) && grid[newx][newy] == '1' && !used[newx][newy]){
//                search(grid, index, newx, newy);
//            }
//        }
//        return;
//    }
//    boolean inArea(int x, int y){
//        return x < m && x >= 0 && y < n && y >= 0;
//    }
    
    int[][] d = {{0,1},{1,0},{0,-1},{-1,0}};
    boolean[][] used;
    int m, n;
    int count;
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return count;
        m = grid.length;
        n = grid[0].length;
        used = new boolean[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                 // 此处相当于递归的终止条件     每次符合条件才进入递归。  移到这里是为了计算count  只在最浅层递归调用的时候才count++  如果写在递归里面，则深层的递归都会导致count++
                if(grid[i][j] == '1' && !used[i][j]){
                    count ++;
                    search(grid, i, j);
                }
        return count;
    }
    void search(char[][] grid, int x, int y){
        used[x][y] = true;
        for(int i = 0; i < 4; i++){
            int newx = x + d[i][0];
            int newy = y + d[i][1];
            if(inArea(newx, newy) && !used[newx][newy] && grid[newx][newy] == '1'){
                search(grid, newx, newy);
            }
        }
        return;
    }
    boolean inArea(int x, int y){
        return x < m && x >= 0 && y < n && y >= 0;
    }
    
    public static void main(String[] args){
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
//        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        Solution200 s = new Solution200();
        System.out.println(s.numIslands(grid));
    }
}
