package com.liuhx;

public class Ninth {
    public static void main(String[] args) {
        System.out.print(isPalindrome(-21412));
    }

    public static boolean isPalindrome(int x) {
        String z = String.valueOf(x);
        int length = z.length();
        if (length < 2)
            return true;
        if (x<0||x%10==0) return false;
        int r = length / 2;
        char[] c = z.toCharArray();
        for (int i = 0; i <= r; i++) {
            if (c[i] != c[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}