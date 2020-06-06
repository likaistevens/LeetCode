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
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode tail = dummyhead;
        ListNode pre = dummyhead;
        for(int i = 0; i <= n; i++){
            tail = tail.next;
        }
        while(tail != null){
            pre = pre.next;
            tail = tail.next;
        }
        ListNode del = pre.next;
        pre.next = del.next;
        return dummyhead.next;
    }
}
