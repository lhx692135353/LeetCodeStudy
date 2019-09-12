package com.liuhx;

/**
 * @program leetCodeStudy
 * @description: 寻找两个有序数组的中位数
 * @author: liuhx
 * @create: 2019/04/24 11:11
 */
public class Fourth {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2};
        System.out.println(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        double result;
        int n = 0;
        int m = 0;
        int[] num3 = new int[nums1.length + nums2.length];

        for (int i = 0; i < (nums1Length + nums2Length); i++) {
            if (n == nums1Length || m == nums2Length) {
                while (i < nums1Length + nums2Length) {
                    if (n == nums1Length) {
                        num3[i] = nums2[m];
                        i++;
                        m++;
                    } else {
                        num3[i] = nums1[n];
                        i++;
                        n++;
                    }
                }
                break;
            }
            if (nums1[n] < nums2[m]) {
                num3[i] = nums1[n];
                n++;
            } else {
                num3[i] = nums2[m];
                m++;
            }
        }
        if ((nums1Length + nums2Length) % 2 == 0) {
            result = (double) (num3[(nums1Length + nums2Length) / 2 - 1] + num3[(nums1Length + nums2Length) / 2]) / 2;
        } else {
            result = num3[(nums1Length + nums2Length - 1) / 2];
        }
        return result;

    }
}
