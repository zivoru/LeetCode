package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/climbing-stairs
 * Title: 70. Climbing Stairs
 * Difficulty: Easy
 */
public class Problem70 {
    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int result = 0, prevStep = 1, step = 2;
        for (int i = 2; i < n; i++) {
            result = prevStep + step;
            prevStep = step;
            step = result;
        }
        return result;
    }
}
