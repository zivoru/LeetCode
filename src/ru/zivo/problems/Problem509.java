package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/fibonacci-number
 * Title: 509. Fibonacci Number
 * Difficulty: Easy
 */
public class Problem509 {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (n == 3) return 2;

        int fib = 0, prevF = 1, f = 2;
        for (int i = 3; i < n; i++) {
            fib = prevF + f;
            prevF = f;
            f = fib;
        }
        return fib;
    }
}
