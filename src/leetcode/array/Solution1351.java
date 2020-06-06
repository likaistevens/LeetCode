// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
//Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise. 
package leetcode.array;

// 利用dp的思想，倒叙遍历，第一行从最后，到第i个大于0，第二行就从i开始遍历
public class Solution1351 {

    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int tip = n - 1;
        int num = 0;

        for (int i = 0; i < m; i++) {
            System.out.println("___________  i star " + i);
            for (int j = tip; j >= 0; --j) {
                                    System.out.println("j " + j);

                System.out.println(grid[i][j]);
                if (grid[i][j] >= 0) {
                    tip = j;
                    System.out.println("tip " + tip);
                    num += n - j - 1;
                    System.out.println("num " + num);
                    System.out.println("******** ");
                }
                ;

            }
        }

        return num;

    }

    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        Solution1351 s = new Solution1351();
        System.out.println(s.countNegatives(grid));
    }
}
