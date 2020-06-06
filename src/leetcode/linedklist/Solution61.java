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
public class Solution61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)    return head;

        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size ++;
            temp = temp.next;
        }
        head = helper(head, k % size);
        return head;
    }
    public static ListNode helper(ListNode head, int k) {
        if(k == 0)  return head;
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode pre = dummyhead;
        ListNode tail = dummyhead;
        for(int i = 0; i < k; i++){
            tail = tail.next;
        }
        while(tail.next != null){
            tail = tail.next;
            pre = pre.next;
        }
        head = pre.next;
        tail.next = dummyhead.next;
        pre.next = null;
        return head;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2};
        ListNode head = new ListNode(arr);
        System.out.println(helper(head,2));
    }
}
