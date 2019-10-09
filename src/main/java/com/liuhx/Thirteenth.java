package com.liuhx;

/**
 * 罗马数字转整数
 */
public class Thirteenth {
    public static void main(String[] args) {
            System.out.print(romanToInt("MMMDCCC"));
    }

    public static int romanToInt(String s) {
        int num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (i < s.length()-1) {
                if (transform(s.charAt(i)) < transform(s.charAt(i + 1))) {
                    num = num - transform(s.charAt(i));
                    continue;
                }
            }
            num += transform(s.charAt(i));
        }
        return num;
    }

    public static int transform(char c) {
        if (c == 'I')
            return 1;
        else if (c == 'V')
            return 5;
        else if (c == 'X')
            return 10;
        else if (c == 'L')
            return 50;
        else if (c == 'C')
            return 100;
        else if (c == 'D')
            return 500;
        else
            return 1000;
    }
}