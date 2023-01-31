package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/missing-number
 * Title: 268. Missing Number
 * Difficulty: Easy
 */
public class Problem268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return (1 + nums.length) * nums.length / 2 - sum;
    }
}
