package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/reverse-string
 * Title: 344. Reverse String
 * Difficulty: Easy
 */
public class Problem344 {
    public void reverseString(char[] s) {
        char[] clone = s.clone();
        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            s[j] = clone[i];
        }
    }
}
