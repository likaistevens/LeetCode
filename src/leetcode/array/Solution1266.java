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
public class Solution1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int nums = 0;
        for (int i = 0; i < points.length - 1; i++) {
            nums += Math.abs(points[i][0] - points[i+1][0]) + Math.abs(points[i][1] - points[i+1][1]) - Math.min(Math.abs(points[i][0] - points[i+1][0]), Math.abs(points[i][1] - points[i+1][1]));
        }
        return nums;
    }
    
    public static void main(String[] args){
        Solution1266 s = new Solution1266();
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(s.minTimeToVisitAllPoints(points));
    }
    
}
