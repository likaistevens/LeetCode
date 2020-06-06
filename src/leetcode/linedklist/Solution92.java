package leetcode.linedklist;

/**
 *
 * @author kaili
 */
public class Solution92 {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return head;
        
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = null;
        ListNode nex = null;
        ListNode one = res;

        for(int i = 0; i < m - 1; i ++){
            one = one.next;
        }
        ListNode cur = one.next;
        
        for(int i = m ; i <= n; i++){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        one.next.next = cur;
        one.next = pre;
        
        return res.next;
    }
    
    
    public static ListNode reverseBetween2(ListNode head, int m, int n) {
        ListNode res = new ListNode(0);
        ListNode pre = res;
        ListNode cur = head;
        pre.next = cur;
        ListNode nex = null;
        ListNode one = null;

        for(int i = 0; i < m - 1; i ++){
            pre = pre.next;
        }
        one = pre;
        pre = pre.next;
        cur = pre.next;
        for(int i = m ; i < n; i++){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        one.next.next = cur;
        one.next = pre;
        
        return res.next;
    }
    
    public static void main(String[] args){
        int[] arr = {3,5};
        ListNode head = new ListNode(arr);
        int  m = 1, n = 2;
        System.out.println(reverseBetween(head, m, n));        
    }
}
