package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/smallest-even-multiple
 * Title: 2413. Smallest Even Multiple
 * Difficulty: Easy
 */
public class Problem2413 {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }
}
