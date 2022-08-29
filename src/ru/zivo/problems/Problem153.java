package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
 * Title: 153. Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 */
public class Problem153 {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i - 1] > nums[i]) return min;
        }
        return min;
    }
}
