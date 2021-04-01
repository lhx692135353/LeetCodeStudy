package com.liuhx;

import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> priorityQueue;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<Integer>();
        for(int num:nums){
            add(num);
        }
    }

    public int add(int val){
        priorityQueue.offer(val);
        if(priorityQueue.size()>k){
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
