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
public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode head1 = l1;
        ListNode head2 = l2;

        while(head != null){
            if(head.val < x){
                l1.next = head;
                head = head.next;
                l1 = l1.next;
                l1.next = null;
            }else{
                l2.next = head;
                head = head.next;
                l2 = l2.next;
                l2.next = null;
            }
        }
        l1.next = head2.next;
        return head1.next;
    }
}
