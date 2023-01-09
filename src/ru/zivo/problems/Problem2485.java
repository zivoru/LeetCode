package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-the-pivot-integer
 * Title: 2485. Find the Pivot Integer
 * Difficulty: Easy
 */
public class Problem2485 {
    public int pivotInteger(int n) {
        int sum = 0, subSum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        for (int i = n; i > 0; i--) {
            subSum += i;
            if (subSum == sum) {
                return i;
            }
            sum -= i;
        }
        return -1;
    }
}
