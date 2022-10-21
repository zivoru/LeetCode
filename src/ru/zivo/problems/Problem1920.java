package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/build-array-from-permutation
 * Title: 1920. Build Array from Permutation
 * Difficulty: Easy
 */
public class Problem1920 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
