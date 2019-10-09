package com.liuhx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fifteenth {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int h = nums.length - 1;
            while (l < h) {
                int sum = nums[i] + nums[l] + nums[h];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    while (l < h && nums[l + 1] == nums[l])
                        l++;
                    while (l < h && nums[h - 1] == nums[h])
                        h--;
                    l++;
                    h--;
                } else if (sum < 0)
                    l++;
                else
                    h--;
            }
        }
        return list;
    }
}