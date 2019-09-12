package com.liuhx;

/**
 * @program leetCodeStudy
 * @description: 第八题 字符串转换整数 (atoi)
 * @author: liuhx
 * @create: 2019/09/11 10:49
 */
public class Eighth {
    public static void main(String[] args) {
        System.out.println(myAtoi("-42"));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        if (str == null || str.length() == 0) return 0;
        int sign = 1;
        int start = 0;
        long res = 0;
        char firstChar = str.charAt(0);
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return (int) res * sign;
            res = res * 10 + str.charAt(i) - '0';
            if (sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) res * sign;

    }
}
