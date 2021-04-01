package com.liuhx;

public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int n=0;
        ListNode cur = head;
        while(cur!=null){
            cur = cur.next;
            n++;
        }
        ListNode end = head;
        for(int i=0;i<n-k;i++){
            end = end.next;
        }
        return end;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
 