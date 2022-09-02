package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-pivot-index
 * Title: 724. Find Pivot Index
 * Difficulty: Easy
 */
public class Problem724 {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int num : nums) sum += num;
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
