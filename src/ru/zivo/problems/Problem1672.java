package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/where-will-the-ball-fall
 * Title: 1706. Where Will the Ball Fall
 * Difficulty: Medium
 */
public class Problem1672 {
    public int maximumWealth(int[][] accounts) {
        int max = accounts[0][0];
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
