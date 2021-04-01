package com.liuhx.sort;

import java.util.Arrays;

/**
 * @program leetCodeStudy
 * @description:
 * @author: liuhx
 * @create: 2021/03/24 14:38
 */
public class Bubble {
    public static int[] handle(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int a = num[j];
                    num[j] = num[j + 1];
                    num[j+1] = a;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] a = new int[]{23,48,12,34,87,1,34};
        System.out.println(Arrays.toString(handle(a)));
    }
}
