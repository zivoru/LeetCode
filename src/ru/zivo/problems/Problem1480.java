package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/running-sum-of-1d-array
 * Title: 1480. Running Sum of 1d Array
 * Difficulty: Easy
 */
public class Problem1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
