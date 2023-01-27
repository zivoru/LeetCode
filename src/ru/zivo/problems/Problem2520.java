package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/count-the-digits-that-divide-a-number
 * Title: 2520. Count the Digits That Divide a Number
 * Difficulty: Easy
 */
public class Problem2520 {
    public int countDigits(int num) {
        int count = 0, clone = num;
        while (num > 0) {
            if (clone % (num % 10) == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
