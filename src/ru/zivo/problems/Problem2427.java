package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/number-of-common-factors
 * Title: 2427. Number of Common Factors
 * Difficulty: Easy
 */
public class Problem2427 {
    public int commonFactors(int a, int b) {
        int res = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                res++;
            }
        }
        return res;
    }
}
