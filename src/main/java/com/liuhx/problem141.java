package com.liuhx;

public class problem141 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode one = head;
        ListNode two = head.next;
        while (one != two) {
            if (two.next == null || two == null) {
                return false;
            }
            one = one.next;
            two = two.next.next;
        }
        return true;
    }
}