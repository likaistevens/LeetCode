/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.other;

/**
 *
 * @author kaili
 */
public class Solution461 {
    public static int hammingDistance(int x, int y) {
        // Integer.bitCount返回数据的二进制中1的个数
        // x ^ y 不相同的位置取1
        return Integer.bitCount(x ^ y);
    }
    
    public static void main(String[] args){
        System.out.println(hammingDistance(1,4));
    }
}
