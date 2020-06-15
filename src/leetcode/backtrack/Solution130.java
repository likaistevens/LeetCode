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
public class Solution130 {

    static int m, n;
    static int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        m = board.length;
        n = board[0].length;
        System.out.println(m + " " + n);
        if (m == 1) {
            if (board[0][0] == 'O') {
                board[0][0] = 'K';
            }
        } else {
            for (int i = 0; i < m; i++) {
                board[i][0] = board[i][0] == 'O' ? 'K' : 'X';
                board[i][n - 1] = board[i][n - 1] == 'O' ? 'K' : 'X';
            }
            for (int i = 1; i < n - 1; i++) {
                board[0][i] = board[0][i] == 'O' ? 'K' : 'X';
                board[m - 1][i] = board[m - 1][i] == 'O' ? 'K' : 'X';
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'K') {
                    System.out.println(i + " " + j);
                    bfs(board, i, j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'K') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    static void bfs(char[][] board, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int newx = x + d[i][0];
            int newy = y + d[i][1];
            if (inArea(newx, newy) && board[newx][newy] == 'O') {
                board[newx][newy] = 'K';
                bfs(board, newx, newy);
            }
        }
        return;
    }

    static boolean inArea(int x, int y) {
        return x < m && x >= 0 && y < n && y >= 0;
    }

    public static void main(String[] args) {
//        char[][] board = {{'O'}};
        char[][] board = {{'O', 'O'}, {'O', 'O'}};
//        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solve(board);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
