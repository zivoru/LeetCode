package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/running-sum-of-1d-array
 * Title: 1480. Running Sum of 1d Array
 * Difficulty: Easy
 */
public class Problem1480 {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
