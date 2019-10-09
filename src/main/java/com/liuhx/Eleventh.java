package com.liuhx;

public class Eleventh {
    public static void main(String[] args) {
        int[] n = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(n));
    }

    public static int maxArea(int[] height) {
        int n = 0;
        int m = height.length - 1;
        int s = 0;
        while (n < m) {
            s = Math.max(s, Math.min(height[n], height[m]) * (m - n));
            if(height[n]<height[m]) n++;
            else m--;
        }
        return s;
    }
}