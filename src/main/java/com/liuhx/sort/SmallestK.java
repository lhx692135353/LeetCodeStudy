package com.liuhx.sort;

/**
 * @program leetCodeStudy
 * @description: 第K小个数
 * @author: liuhx
 * @create: 2021/03/24 15:52
 */
public class SmallestK {
    public static int[] smallestK(int[] num, int k) {
        return new int[]{};
    }

    public void swap(int[] num, int l, int r) {
        int temp = num[l];
        num[l] = num[r];
        num[r] = temp;
    }
}
