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
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        //必须加判断链表是不是空，否则cur = head.next会nullpointerexception
        ListNode cur = head.next;
        ListNode prev = head;
        while(cur != null){
        if(cur.val == prev.val){
            prev.next = cur.next;
        }
        else{
            prev = prev.next;
        }
        cur = cur.next;
        }
        return head;
    }
}
