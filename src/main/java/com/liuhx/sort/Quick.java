package com.liuhx.sort;

import java.util.Arrays;

/**
 * @program leetCodeStudy
 * @description: 快排
 * @author: liuhx
 * @create: 2021/03/24 15:06
 */
public class Quick {
    private static  int count =0;
    public static void quick(int[] num, int left, int right) {
        if (left >= right) {
            return;
        }
        int key = num[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (num[j] >= key && j > i) {
                j--;
            }
            while (num[i] <= key && j > i) {
                i++;
            }
            if (i < j) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        num[left] = num[i];
        num[i] = key;
        count++;
        quick(num, left, i - 1);
        quick(num, i + 1, right);
    }
    public static void main(String[] args) {
        int[] a = new int[]{23,48,12,34,87,1,34};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }
}
