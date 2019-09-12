package com.liuhx;

/**
 * @program leetCodeStudy
 * @description: 第六题 Z字形变换
 * @author: liuhx
 * @create: 2019/09/09 10:35
 */
public class Sixth {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        int c = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += c) {
                stringBuilder.append(s.charAt(i + j));
                if (i != 0 && i + 1 < numRows && j + c - i < n) {
                    stringBuilder.append(s.charAt(j + c - i));
                }
            }
        }
        return stringBuilder.toString();
    }
}
