package leetcode.linedklist;
//203 Remove Linked List Elements
import java.util.LinkedList;

public class Solution203 {
    public ListNode removeElements(ListNode head, int val , int depth ) {
        System.out.print(generatedepth(depth));
        System.out.println("Call : Remove " + val + " in " + head);
        
        if(head == null){
            System.out.print(generatedepth(depth));
            System.out.println("Return " + head);
            return null;
        }
        
        ListNode res = removeElements(head.next , val ,depth +1);
        System.out.print(generatedepth(depth));
        System.out.println("After remove " + val + " : " + res);
        
        ListNode ret;
        if(head.val == val){
            ret = res;}
        else{
            head.next = res;
            ret = head;}
        System.out.print(generatedepth(depth));
        System.out.println("Return: " + ret);
        
        return ret;
    }
    public String generatedepth(int depth){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++)
            res.append("--");
        String re = res.toString();
        return re;
    }
    
    public static void main(String[] args){
        int[] array = {1,2,6,3,4,5,6};
        ListNode l1 = new ListNode(array);
        Solution203 s3 = new Solution203();
        s3.removeElements(l1, 6, 0);
    }
}




class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head.val == val && head != null){
            ListNode delNode = head;
            head = head.next;
            delNode.next = null ;
        }
        
        if(head == null)
            return null;
        
        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val){
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }
            else{        
                prev = prev.next;
            }
        }
        return head;
    }
}
    