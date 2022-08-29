package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii
 * Title: 154. Find Minimum in Rotated Sorted Array II
 * Difficulty: Hard
 */
public class Problem154 {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                for (int j = i; j > 0; j--) {
                    if (nums[i] != nums[j]) {
                        i = j + 1;
                        break;
                    }
                }
            }
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i - 1] > nums[i]) return min;
        }
        return min;
    }
}
