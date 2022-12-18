package ru.zivo.problems;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/decompress-run-length-encoded-list
 * Title: 1313. Decompress Run-Length Encoded List
 * Difficulty: Easy
 */
public class Problem1313 {
    public int[] decompressRLElist(int[] nums) {
        int[] ans = new int[0];
        for (int i = 0; i < nums.length; i += 2) {
            int[] newAns = Arrays.copyOf(ans, ans.length + nums[i]);
            Arrays.fill(newAns, ans.length, ans.length + nums[i], nums[i + 1]);
            ans = newAns;
        }
        return ans;
    }
}
