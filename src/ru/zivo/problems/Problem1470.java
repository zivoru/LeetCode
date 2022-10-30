package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/shuffle-the-array
 * Title: 1470. Shuffle the Array
 * Difficulty: Easy
 */
public class Problem1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0, x = 0; n < nums.length; i++, x++, n++) {
            ans[i] = nums[x];
            ans[++i] = nums[n];
        }
        return ans;
    }
}
