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
public class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n == 0)  return null;
        while (n != 1) {
            for (int i = 0; i < n / 2; i++) {
                lists[i] = mergeTwoLists(lists[2 * i], lists[2 * i + 1]);
            }
            if (n % 2 != 0) {
                lists[(n - 1) / 2] = lists[n - 1];
            }
            n = (n + 1) / 2;
        }
        return lists[0];
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        ListNode res = new ListNode(Integer.MIN_VALUE);
        for (int i = 0; i < lists.length; i++) {
            res = mergeTwoLists(res, lists[i]);
        }
        return res;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(0);
        ListNode res = list;
        while (list1 != null && list2 != null) {
            list.next = new ListNode(0);
            list = list.next;
            if (list1.val <= list2.val) {
                list.val = list1.val;
                list1 = list1.next;
            } else {
                list.val = list2.val;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            list.next = list2;
        }
        if (list2 == null) {
            list.next = list1;
        }
        return res.next;
    }

    // 合并链表 递归实现 。 每次都返回合并好了的链表
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // l1小，就把l1头和 合并好的链表相接
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(0);
        ListNode cur = dummyhead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return dummyhead.next;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode node1 = new ListNode(arr1);
        ListNode node2 = new ListNode(arr2);
        ListNode list = mergeTwoLists(node1, node2);
        while (list != null) {
            System.out.print(list.val);
            list = list.next;
        }
    }
}
