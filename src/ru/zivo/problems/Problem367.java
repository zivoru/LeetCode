package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/valid-perfect-square
 * Title: 367. Valid Perfect Square
 * Difficulty: Easy
 */
public class Problem367 {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        for (int i = num / 2; i > 0; i--) {
            if (i * i == num) return true;
        }
        return false;
    }
}
