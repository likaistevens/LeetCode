package leetcode.linedklist;

/**
 *
 * @author kaili
 */
public class Solution82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)    return head;
        
        ListNode pre = new ListNode(0);
        ListNode dummyhead = pre;
        ListNode cur = head;
        pre.next = cur;
        ListNode nex = cur.next;
        
        while(nex != null){
            if(cur.val != nex.val){
                pre = cur;
                cur = nex;
                nex = nex.next;
            }else{
                while(cur.val == nex.val){
                    nex = nex.next;
                }
                pre.next = nex;
                cur = nex;
                nex = nex.next;
            }
        }
        
        return dummyhead.next;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,4,5};
        ListNode head = new ListNode(arr);
        System.out.println(deleteDuplicates(head));
    }
}
