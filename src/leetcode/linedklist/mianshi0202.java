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
public class mianshi0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode cur = head;
        ListNode point = head;
        
        for(int i = 0 ; i < k ; i ++){
            point = point.next;
        }
        
        while(point!=null){
            cur = cur.next;
            point = point.next;
        }
        
        return cur.val;
    }
}
