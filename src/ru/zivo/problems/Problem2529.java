package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer
 * Title: 2529. Maximum Count of Positive Integer and Negative Integer
 * Difficulty: Easy
 */
public class Problem2529 {
    public int maximumCount(int[] nums) {
        int positive = 0, negative = 0;
        for (int num : nums) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }
        return Math.max(positive, negative);
    }
}
