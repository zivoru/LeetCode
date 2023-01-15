package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-the-highest-altitude
 * Title: 1732. Find the Highest Altitude
 * Difficulty: Easy
 */
public class Problem1732 {
    public int largestAltitude(int[] gain) {
        int max = 0, curr = 0;
        for (int i : gain) {
            curr += i;
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }
}
