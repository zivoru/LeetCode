package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/reverse-integer
 * Title: 7. Reverse Integer
 * Difficulty: Medium
 */
public class Problem7 {
    public int reverse(int x) {
        long reversed = 0;
        for (; x != 0; x /= 10) {
            reversed = (x % 10) + (reversed * 10);
        }
        return reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE ? 0 : (int) reversed;
    }
}
