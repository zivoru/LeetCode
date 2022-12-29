package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k
 * Title: 2006. Count Number of Pairs With Absolute Difference K
 * Difficulty: Easy
 */
public class Problem2006 {
    public int countKDifference(int[] nums, int k) {
        int[] array = new int[101];
        int count = 0;
        for (int num : nums) {
            if (k + num < 101) {
                count += array[k + num];
            }
            int abs = Math.abs(k - num);
            if (Math.abs(abs - num) == k) {
                count += array[abs];
            }
            array[num]++;
        }
        return count;
    }
}
