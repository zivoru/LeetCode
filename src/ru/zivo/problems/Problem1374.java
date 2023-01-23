package ru.zivo.problems;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts
 * Title: 1374. Generate a String With Characters That Have Odd Counts
 * Difficulty: Easy
 */
public class Problem1374 {
    public String generateTheString(int n) {
        char[] chars = new char[n];
        Arrays.fill(chars, 'a');
        chars[0] = 'b';
        if (n % 2 != 0 && n > 1) {
            chars[1] = 'c';
        }
        return new String(chars);
    }
}
