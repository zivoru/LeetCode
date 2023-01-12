package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
 * Title: 1464. Maximum Product of Two Elements in an Array
 * Difficulty: Easy
 */
public class Problem1464 {
    public int maxProduct(int[] nums) {
        int max1 = nums[0], max2 = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = Math.max(max2, max1);
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max1 = Math.max(max1, max2);
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
