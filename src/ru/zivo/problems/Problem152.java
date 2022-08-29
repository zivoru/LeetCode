package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/maximum-product-subarray
 * Title: 152. Maximum Product Subarray
 * Difficulty: Medium
 */
public class Problem152 {
    public int maxProduct(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                if (product > max) {
                    max = product;
                }
            }
        }

        return max;
    }
}
