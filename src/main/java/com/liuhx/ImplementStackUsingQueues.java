package com.liuhx;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
     /** Initialize your data structure here. */
     Queue<Integer> first ;
     Queue<Integer> second ;
     public ImplementStackUsingQueues() {
        first = new LinkedList<Integer>();
        second = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        second.offer(x);
        while (!first.isEmpty()){
            second.offer(first.poll());
        }
        Queue<Integer> temp = first;
        first = second;
        second = temp;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return first.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return first.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return first.isEmpty();
    }
}
