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
public class Solution147 {

    public static ListNode insertionSortList(ListNode head) {
        ListNode dummyhead =  new ListNode(Integer.MIN_VALUE);
        dummyhead.next = head;
        ListNode pre = dummyhead;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val >= pre.val) {
                cur = cur.next;
                pre = pre.next;
            } else {
                pre.next = cur.next;
                
                ListNode l = dummyhead;
                ListNode r = dummyhead.next;

                while (true) {
                    if (r.val > cur.val){
                        l.next = cur;
                        cur.next = r;
                        cur = pre.next;
                        l = dummyhead;
                        r = dummyhead.next;
                        System.out.println(dummyhead);
                        break;
                    }else{
                        r = r.next;
                        l = l.next;
                    }
                }
            }
        }
        return dummyhead.next;
    }
    
    public static void main(String[] args){
        int[] arr = {4,2,1,3};
        ListNode head = new ListNode(arr);
        System.out.println(insertionSortList(head));
    }
}
