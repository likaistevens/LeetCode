/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.linedklist;

import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution445 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        while (l1 != null) {
            stack1.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.add(l2.val);
            l2 = l2.next;
        }

        int carry = 0;

        while (!stack1.empty() || !stack2.empty()) {
            int x = stack1.empty() ? 0 : stack1.pop();
            int y = stack2.empty() ? 0 : stack2.pop();
            int sum = x + y + carry;
            carry = sum / 10;
            stack3.add(sum % 10);
        }
        if(carry == 1){
            stack3.add(carry);
        }
        ListNode node = new ListNode(0);
        ListNode res = node;
        
        while (!stack3.empty()) {
            node.next = new ListNode(stack3.pop());
            node = node.next;
        }
        
        return res.next;
    }

    public static void main(String[] args) {
//        int[] arr1 = {7, 2, 4, 3};
//        int[] arr2 = {5, 6, 4};
//        ListNode l1 = new ListNode(arr1);
//        ListNode l2 = new ListNode(arr2);
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        System.out.println(addTwoNumbers(l1,l2));
    }
}
