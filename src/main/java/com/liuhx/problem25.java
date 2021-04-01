package com.liuhx;

public class problem25 {
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

    public static void main(String[] args) {
        String a ="ab";
        String b = "a"+"b";
        System.out.println(a==b);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode one = first;
        while (head != null) {
            ListNode two = one;
            for (int i = 0; i < k; i++) {
                two = two.next;
                if (two == null) {
                    return first.next;
                }
            }
            
        }
        return first.next;
    }
}
