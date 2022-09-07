package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/binary-search
 * Title: 704. Binary Search
 * Difficulty: Easy
 */
public class Problem704 {
    public int search(int[] nums, int target) {
        if (nums.length < 10) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) return i;
            }
        }

        int center = nums.length / 2, quarter;

        if (nums[center] == target) return center;

        if (nums[center] < target) {
            quarter = nums.length / 2 + nums.length / 4;

            if (nums[quarter] < target) {
                for (int i = quarter; i < nums.length; i++) {
                    if (nums[i] == target) return i;
                }
            } else {
                for (int i = quarter; i > center; i--) {
                    if (nums[i] == target) return i;
                }
            }
        } else {
            quarter = nums.length / 4;

            if (nums[quarter] < target) {
                for (int i = quarter; i < center; i++) {
                    if (nums[i] == target) return i;
                }
            } else {
                for (int i = quarter; i >= 0; i--) {
                    if (nums[i] == target) return i;
                }
            }
        }

        return -1;
    }
}
