package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/single-number
 * Title: 136. Single Number
 * Difficulty: Easy
 */
public class Problem136 {
    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}
