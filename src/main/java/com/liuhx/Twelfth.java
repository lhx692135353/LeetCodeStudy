package com.liuhx;
/**
 *  12、整数转罗马数字
 */
public class Twelfth {
    public static void main(String[] args) {
     System.out.print(intToRoman(3866));
    }

    public static String intToRoman(int num) {
        if (num > 3999 || num < 1)
            return null;
        StringBuilder result = new StringBuilder();
        int t = num / 1000;
        if (t > 0) {
            for (int i = 0; i < t; i++) {
                result.append("M");
            }
            num = num - t * 1000;
        }
        int h = num / 100;
        if (h > 5) {
            if (h == 9)
                result.append("CM");
            else {
                result.append("D");
                for (int i = 0; i < h - 5; i++) {
                    result.append("C");
                }
            }
        } else if (h == 5) {
            result.append("D");
        } else {
            if (h == 4)
                result.append("CD");
            else {
                for (int i = 0; i < h; i++) {
                    result.append("C");
                }
            }
        }
        num = num - h * 100;
        int d = num / 10;
        if (d > 5) {
            if (d == 9)
                result.append("XC");
            else {
                result.append("L");
                for (int i = 0; i < d - 5; i++) {
                    result.append("X");
                }
            }
        } else if (d == 5) {
            result.append("L");
        } else {
            if (d == 4)
                result.append("XL");
            else {
                for (int i = 0; i < d; i++) {
                    result.append("X");
                }
            }
        }
        num = num - d * 10;
        if (num > 5) {
            if (num == 9)
                result.append("IX");
            else {
                result.append("V");
                for (int i = 0; i < num - 5; i++) {
                    result.append("I");
                }
            }
        } else if (num == 5) {
            result.append("V");
        } else {
            if (num == 4)
                result.append("IV");
            else {
                for (int i = 0; i < num; i++) {
                    result.append("I");
                }
            }
        }

        return result.toString();
    }
}