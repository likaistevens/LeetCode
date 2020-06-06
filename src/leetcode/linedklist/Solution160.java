//编写一个程序，找到两个单链表相交的起始节点。
package leetcode.linedklist;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author kaili
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while(curA != curB){
            if(curA != null){       //这里必须是curA ！= null 如果用的是curA.next ！= null,两个链表确实同时向后移，对于有相同节点
                curA = curA.next;   //curA = curB，的链表是可以的，但是对于没有相同节点的链表，第二次便利完，curA和curB都是null，此
            }                       //时应该结束while循环，返回null。 如果是curA.next会导致在没有相同节点的情况下没法结束while循环
            else{
                curA = headB;
            }
            
            if(curB != null){
                curB = curB.next;
            }
            else{
                curB = headA;
            }
           // System.out.println("A " + curA);
            //System.out.println("B " + curB);
        }
    return curA; 
    } 
}

// 让两个链表连起来， A -> B    B -> A  这样两个新合成的链表长度相等，可以同时向后迁移指针，同时新合成的链表最后一部分即A和B的公共部分
// 还有个注意点：链表相等，即节点直接相等。 headA == headB 。  可以直接这么判断


