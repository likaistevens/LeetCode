/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.linedklist;

/**
 *
 * @author kaili
 */
public class Solution1290 {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head != null){
            sum = sum * 2 + head.val;    //计算二进制的一种递归算法
            head = head.next;
        }
        return sum;
    }
}
