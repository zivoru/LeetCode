package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/missing-number
 * Title: 268. Missing Number
 * Difficulty: Easy
 */
public class Problem268 {
    public int missingNumber(int[] nums) {
        int[] ints = new int[nums.length + 1];
        for (int num : nums) ints[num]++;
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == 0) return j;
        }
        return -1;
    }
}
