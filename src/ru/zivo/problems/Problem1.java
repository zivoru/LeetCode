package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/two-sum
 * Title: 1. Two Sum
 * Difficulty: Easy
 */
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + nums[i + 1]) == target) {
                return new int[]{i, i + 1};
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 2; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
