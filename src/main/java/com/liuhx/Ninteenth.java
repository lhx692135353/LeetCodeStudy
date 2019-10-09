package com.liuhx;

public class Ninteenth {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
//        a.next.next = new ListNode(3);
//        a.next.next.next = new ListNode(4);
//        a.next.next.next.next = new ListNode(5);
        ListNode z = removeNthFromEnd(a, 2);
        System.out.println(z.val);
        while (z.next != null) {
            System.out.println(z.next.val);
            z = z.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int lenth = 1;
        ListNode a = head;
        while (a.next != null) {
            a = a.next;
            lenth++;
        }
        if (lenth == 1) {
            return null;
        }
        int m = lenth + 1 - n;
        if (m == 1) {
            head = head.next;
        }
        ListNode r = head;
        for (int i = 1; i < lenth; i++) {
            if (i == m - 1) {
                r.next = r.next.next;
            }
            r = r.next;
            if (r == null) {
                break;
            }
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