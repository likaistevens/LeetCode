package leetcode.linedklist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next , l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l2.next , l1);
            return l2;
        }    
    }
    
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2){
        ListNode dummyhead = new ListNode(0) ;
        ListNode cur = dummyhead;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
            else{
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        
        if(l1 == null)
            cur.next = l2;
        if(l2 == null)
            cur.next = l1;
        
        return dummyhead.next;
                
    }
}

