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
public class Solution143 {
    public static void reorderList(ListNode head) {
        ListNode prehalf = new ListNode(0);
        prehalf.next = head;
        ListNode half = head;
        ListNode tail = head;
        ListNode cur = head;
        ListNode hea = head;
        while(tail != null && tail.next != null){
            prehalf = prehalf.next;
            half = half.next;
            tail = tail.next.next;
        }
        prehalf.next = null;
        half = reverseList(half);
        
        while(hea != null && half != null){
            hea = hea.next;
            cur.next = half;
            cur = cur.next;
            half = half.next;
            cur.next = hea;
            if(cur.next != null)
                cur = cur.next;
        }
        cur.next = half;
        System.out.println(head);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        
        return pre;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        ListNode head = new ListNode(arr);
        reorderList(head);
    }
}
