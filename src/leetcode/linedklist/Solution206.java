//反转一个单链表。
//
//示例:
//
//输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
//进阶:
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/reverse-linked-list
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
package leetcode.linedklist;

import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
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
}

// cur.next指向前一个pre之后， 中间出现断开，怎么处理？
// 直接每次循环一开始都创建一个temp = cur.next ，这样循环结束之后，让cur = temp
// 这样就不要求从前一个节点去找cur
