package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/create-target-array-in-the-given-order
 * Title: 1389. Create Target Array in the Given Order
 * Difficulty: Easy
 */
public class Problem1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < index.length; i++) {
            int prev = ans[index[i]];
            for (int j = index[i] + 1; j < ans.length; j++) {
                int currPrev = ans[j];
                ans[j] = prev;
                prev = currPrev;
            }
            ans[index[i]] = nums[i];
        }

        return ans;
    }
}
