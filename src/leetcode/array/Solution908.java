/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.Arrays;

/**
 *
 * @author kaili
 */
public class Solution908 {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        
        return (A[0]+K >= A[A.length-1]-K) ? 0 : A[A.length-1]-A[0]-2*K;
    }
}
