package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-peak-element
 * Title: 162. Find Peak Element
 * Difficulty: Medium
 */
public class Problem162 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && i != nums.length - 1) {
                if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                    return i;
                }
            } else if (i == nums.length - 1) {
                if (nums[i - 1] < nums[i]) return i;
            }
        }
        return 0;
    }
}
