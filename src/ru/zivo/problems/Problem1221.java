package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/split-a-string-in-balanced-strings
 * Title: 1221. Split a String in Balanced Strings
 * Difficulty: Easy
 */
public class Problem1221 {
    public int balancedStringSplit(String s) {
        int max = 0, R = 0, L = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                R++;
            } else {
                L++;
            }
            if (R == L) {
                max++;
            }
        }
        return max;
    }
}
