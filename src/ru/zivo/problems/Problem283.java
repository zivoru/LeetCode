package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/move-zeroes
 * Title: 283. Move Zeroes
 * Difficulty: Easy
 */
public class Problem283 {
    public void moveZeroes(int[] nums) {
        int bias = 0, l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] == 0) {
                bias++;
            } else {
                nums[i - bias] = nums[i];
            }
        }
        for (int i = l - bias; i < l; i++) {
            nums[i] = 0;
        }
    }
}
