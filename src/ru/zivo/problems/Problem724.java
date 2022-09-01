package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-pivot-index
 * Title: 724. Find Pivot Index
 * Difficulty: Easy
 */
public class Problem724 {
    public int pivotIndex(int[] nums) {
        int[] sumAndIndex = new int[nums.length];
        sumAndIndex[0] = 0;
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i - 1];
            sumAndIndex[i] = sum;
        }
        sum += nums[nums.length - 1];
        for (int i = 1; i < nums.length + 1; i++) {
            sum -= nums[i - 1];
            if (sumAndIndex[i - 1] == sum) {
                return i - 1;
            }
        }
        return -1;
    }
}
