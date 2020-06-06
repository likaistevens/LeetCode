/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kaili
 */
public class Solution118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 1; i <= numRows; i++) {
            // 第 i 层内部列表填充
            List<Integer> inside = new LinkedList<>();
            for (int j : gen(i)) {
                inside.add(j);
            }
            list.add(inside);
        }
        return list;

    }

    public static int[] gen(int n) {
        if (n == 1) {
            int[] res = {1};
            return res;
        }
        if (n == 2) {
            int[] res = {1, 1};
            return res;
        }
        return proo(gen(n - 1), n);
    }

    public static int[] proo(int[] nums, int n) {
        // n = nums.length + 1
        int[] res = new int[n];
        res[0] = 1;
        res[n - 1] = 1;
        for (int i = 1; i < n - 1; i++) {
            res[i] = nums[i] + nums[i - 1];
        }
        return res;
    }

    public static void main(String[] args) {

//           for(List<Integer> i : generate(5)){
//            for(int j : i){
//                System.out.print(j);
//            }
//            System.out.println();
//        } 
        System.out.println(Integer.toBinaryString(-2));
    }
}
