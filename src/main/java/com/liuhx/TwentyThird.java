package com.liuhx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program leetCodeStudy
 * @description: 第二十三题  合并K个排序链表
 * @author: liuhx
 * @create: 2019/10/08 11:38
 */
public class TwentyThird {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode listNode = lists[i];
            while (listNode != null) {
                list.add(listNode.val);
                listNode = listNode.next;
            }
        }
        if (list.size()==0){
            return null;
        }
        Object[] a = list.toArray();
        Arrays.sort(a);
        ListNode l = new ListNode((Integer) a[0]);
        ListNode l4 = l;
        for (int i = 1; i < a.length; i++) {
            l4.next = new ListNode((Integer) a[i]);
            l4 = l4.next;
        }
        return l;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
