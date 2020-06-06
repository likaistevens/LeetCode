//给定一个链表，判断链表中是否有环
//有环，即链表最后一个节点指向了链表中间的某一个节点
//有环，返回true，否则返回false
package leetcode.linedklist;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kaili
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeset = new HashSet<>();
        nodeset.contains(head);
        while(head != null){
            if(!nodeset.contains(head))
                nodeset.add(head);
            else
                return true;
            head = head.next;
        }
        return false;
    }
}
//方法1直接用hashset装每个node，到头了就没有环，如果没到头，有重复的（contains），就有环

class Solution141_2 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        if (head == null || head.next == null) {
            return false;
        }
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
    
    public static void main(String[] args){
        int[] array = {1,2};
        ListNode arr = new ListNode(array);
        Solution141_2 s = new Solution141_2();
        s.hasCycle(arr);
    }
}
//方法2 利用快慢指针，快针每次走两个，慢针每次走一个，如果有环，快针总会追上慢针


