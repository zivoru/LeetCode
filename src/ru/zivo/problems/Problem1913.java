package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/maximum-product-difference-between-two-pairs
 * Title: 1913. Maximum Product Difference Between Two Pairs
 * Difficulty: Easy
 */
public class Problem1913 {
    public int maxProductDifference(int[] nums) {
        int max1 = nums[0], max2 = nums[1];
        int min1 = nums[0], min2 = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int num = nums[i];
            if (num > max1) {
                if (max1 > max2) {
                    max2 = max1;
                }
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            if (num < min1) {
                if (min1 < min2) {
                    min2 = min1;
                }
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return (max1 * max2) - (min1 * min2);
    }
}
