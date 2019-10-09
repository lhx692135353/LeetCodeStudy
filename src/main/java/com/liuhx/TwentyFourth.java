package com.liuhx;

/**
 * @program leetCodeStudy
 * @description: 两两交换链表中的节点
 * @author: liuhx
 * @create: 2019/10/09 11:41
 */
public class TwentyFourth {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        swapPairs(a);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        ListNode listNode = head;
        ListNode l2 = listNode.next;
        if (l2 == null) return head;
        ListNode l3 = l2.next;
        l2.next = listNode;
        listNode.next = l3;
        head = l2;
        while (listNode.next != null) {
            ListNode la = listNode.next;
            ListNode lb = la.next;
            ListNode lc = lb.next;
            if (lb == null) break;
            listNode.next = lb;
            lb.next = la;
            la.next = lc;
            listNode = la;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
