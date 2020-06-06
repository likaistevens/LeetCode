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
public class Solution1342 {
    public int numberOfSteps (int num) {
        int count = 0;
        if (num == 0)
            return 0;
        while (num != 0){
            if (num % 2 == 0){
                count++;
                num /= 2;
            }
            else{
                num -= 1;
                count ++;
            }
            System.out.println(num);
        }
        return count;
    }
    public static void main(String[] args){
        int i = 14;
        Solution1342 s = new Solution1342();
        System.out.println(s.numberOfSteps(i));
    }
}
