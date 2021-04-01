package com.liuhx;

public class problem206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args){

    }

    public static ListNode reverseList(ListNode head) {
        ListNode newLinked = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = newLinked;
            newLinked = current;
            current = next;
        }
        return newLinked;
    }
}
