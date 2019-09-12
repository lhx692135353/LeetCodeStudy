package com.liuhx;


import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @program leetCodeStudy
 * @description: 5. 最长回文子串
 * @author: liuhx
 * @create: 2019/04/24 14:05
 */
public class Fifth {
    public static String longestPalindrome(String s) {
        if (s.length() == 0) {
            return s;
        }
        char[] a = s.toCharArray();
        String b = "";
        String c;
        for (int i = 1; i < 2 * a.length - 1; i++) {
            int m = i;
            int n = i;
            if (isOdd(i)) {
                c=findA(m, n, a, "");
            } else {
                String d = ""+a[i/2];
                c=findB(m, n, a, d);
            }
            if (c.length()>b.length()){
                b=c;
            }
        }
        if (b == ""||b.length()==1) {
            b = Character.toString(a[0]);
        }
        return b;
    }

    public static boolean isOdd(int a) {
        if ((a & 1) == 1) {   //是奇数
            return true;
        }
        return false;
    }

    public static String findA(int m, int n, char[] a, String d) {
        if (m < 2 * a.length - 1 && n > 0) {
            if (a[(m + 1) / 2] == a[(n - 1) / 2]) {
                d = a[(m + 1) / 2] + d + a[(n - 1) / 2];
                m = m + 2;
                n = n - 2;
                return findA(m, n, a, d);
            }
        }
        return d;
    }

    public static String findB(int m, int n, char[] a, String d) {
        m = m + 2;
        n = n - 2;
        if (m < 2 * a.length - 1 && n >= 0) {
            if (a[m / 2] == a[n / 2]) {
                d = a[m / 2] + d + a[n / 2];
                return findB(m, n, a, d);
            }
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        System.out.println(longestPalindrome("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
    }
}
