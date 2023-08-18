package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/fibonacci-number
 * Title: 509. Fibonacci Number
 * Difficulty: Easy
 */
public class Problem509 {
    public int fib(int n) {
        int prevStep = 0, step = 1;
        for (int i = 1; i < n; i++) {
            step = prevStep + step;
            prevStep = step - prevStep;
        }
        return n == 0 ? 0 : step;
    }
}
