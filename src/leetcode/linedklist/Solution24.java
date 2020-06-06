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
public class Solution24 {

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode pre = dummyhead;
        ListNode cur = head;
        ListNode nex = cur.next;
        ListNode res = nex;
        while (cur.next != null) {
            pre.next = nex;
            cur.next = nex.next;
            nex.next = cur;

            cur = cur.next;
            if (cur != null) {
                pre = nex.next;
                nex = cur.next;
            } else {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ListNode head = new ListNode(arr);
        System.out.println(swapPairs(head));

    }
}
