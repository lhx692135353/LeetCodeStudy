package com.liuhx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program leetCodeStudy
 * @description:
 * @author: liuhx
 * @create: 2019/09/27 15:13
 */
public class TwentyFirst {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.next;
        }
        Object[] a = list.toArray();
        Arrays.sort(a);
        ListNode l3 = new ListNode((Integer) a[0]);
        ListNode l4 = l3;
        for (int i = 1; i < a.length; i++) {
            l4.next = new ListNode((Integer) a[i]);
            l4 = l4.next;
        }

        return l3;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
