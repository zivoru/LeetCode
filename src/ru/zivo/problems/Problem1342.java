package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
 * Title: 1342. Number of Steps to Reduce a Number to Zero
 * Difficulty: Easy
 */
public class Problem1342 {
    int number = 0;

    public int numberOfSteps(int num) {
        if (num == 0) {
            return number;
        }
        number++;
        return num % 2 == 0 ? numberOfSteps(num / 2) : numberOfSteps(num - 1);
    }
}
