package ru.zivo.problems;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/largest-perimeter-triangle
 * Title: 976. Largest Perimeter Triangle
 * Difficulty: Easy
 */
public class Problem976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]
                && nums[i - 1] < nums[i] + nums[i - 2]
                && nums[i - 2] < nums[i] + nums[i - 1]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
