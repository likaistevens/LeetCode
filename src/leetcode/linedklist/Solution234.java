//请判断一个链表是否为回文链表。
package leetcode.linedklist;

import java.util.Stack;

/**
 *
 * @author kaili
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null){
            System.out.println("T");
            return true;
        }
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        while(slow != null){
            stack.add(slow.val);
            slow = slow.next;
        }
        while(!stack.isEmpty()){
            if(stack.pop() == head.val)
                head = head.next;
            else{
                 System.out.println("F");
                return false;}
        }
         System.out.println("T");
        return true;
    }
    
    public static void main(String[] args){
        int[] array = {1,2,3,3,2,1};
        ListNode arr = new ListNode(array);
        Solution234 s = new Solution234();
        s.isPalindrome(arr);
    }
}
//通过快慢指针 找到链表的中心点，再把从中点开始后面的全部压入栈，再一个个出栈与链表从头开始比较
//此方法相对于第二个方法，只需要一半的元素压入栈

class Solution234_2 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        if(head == null || head.next == null){
            return true;
        }
        while(cur != null){
            stack.add(cur.val);
            cur = cur.next;
        }
        while(!stack.isEmpty()){
            if(stack.pop() == head.val)
                head = head.next;
            else{
                 System.out.println("F");
                return false;}
        }
            return true;
    }
    
    public static void main(String[] args){
        int[] array = {1,2,3,3,2,1};
        ListNode arr = new ListNode(array);
        Solution234_2 s = new Solution234_2();
        s.isPalindrome(arr);
    }
}
//直接把链表遍历，所有元素压入栈，然后出栈跟链表从头开始比较


