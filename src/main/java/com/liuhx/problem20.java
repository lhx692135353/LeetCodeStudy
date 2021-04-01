package com.liuhx;

import java.util.Stack;

public class problem20 {
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int l=0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 41 || ch == 93 || ch == 125) {
                if (l==0 || (stack.peek()+1!=ch && stack.peek()+2!=ch)) {
                    return false;
                }
                l--;
                stack.pop();
            } else {
                l++;
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
