package leetcode.array;

import java.util.HashMap;

/**
 *
 * @author kaili
 */
public class Solution1252 {

    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];
        int count = 0;

        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] += 1;
            col[indices[i][1]] += 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((row[i] + col[j]) % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
