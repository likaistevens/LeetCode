/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

/**
 *
 * @author kaili
 */
public class Solution79 {
    int m, n;
    int d[][] = {{-1,0},{0,1},{1,0},{0,-1}};
    boolean[][] used;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        used = new boolean[m][n];
        for(int i = 0; i < board.length; i++)
           for(int j = 0; j < board[i].length; j++)
               if(search(board, 0, word, i, j))
                   return true;
        return false;
    }
    boolean inArea(int x, int y){
        return x >= 0 && x <m && y >= 0 && y < n;
    }
    boolean search(char[][] board, int index, String word, int startx, int starty){
        if(board[startx][starty] == word.charAt(index)){
            if(index == word.length() - 1){
                return true;
            }
            used[startx][starty] = true;
            for(int i = 0; i < 4; i++){
                int newx = startx + d[i][0];
                int newy = starty + d[i][1];
                if(inArea(newx,newy) && !used[newx][newy] && search(board, index + 1, word, newx, newy)){
                    return true;
                }
            }
            used[startx][starty] = false;
        }
        return false;
    }
    
    
//    int d[][] = {{-1,0},{0,1},{1,0},{0,-1}};
//    int m, n;
//    boolean[][] visited;
//    boolean inArea(int x, int y){
//        return x >=0 && x < m && y >= 0 && y <n;
//    }
//    public boolean exist(char[][] board, String word) {
//        // 计算行列数
//        m = board.length;
//        n = board[0].length;
//        visited = new boolean[m][n];
//        for(int i = 0; i < board.length; i++)
//            for(int j = 0; j < board[i].length; j++)
//                if(search(board, word, 0, i, j))
//                    return true;
//        return false;
//    }
//    public boolean search(char[][] board, String word, int index, int startx, int starty){
//        if(index == word.length() - 1){
//            return board[startx][starty] == word.charAt(index);
//        };
//        if(board[startx][starty] == word.charAt(index)){
//            visited[startx][starty] = true;
//            // x向四个方向 继续寻找
//            for(int i = 0; i < 4; i++){
//                int newx = startx + d[i][0];
//                int newy = starty + d[i][1];
//                if(inArea(newx, newy) && !visited[newx][newy]){
//                    if(search(board, word, index +1, newx, newy))
//                        return true;
//                }
//            }
//            visited[startx][starty] = false; 
//        }
//        return false;
//    }
}
