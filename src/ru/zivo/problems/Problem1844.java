package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/replace-all-digits-with-characters
 * Title: 1844. Replace All Digits with Characters
 * Difficulty: Easy
 */
public class Problem1844 {
    public String replaceDigits(String s) {
        var res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                res.append(s.charAt(i));
            } else {
                res.append(shift(s.charAt(i - 1), Character.getNumericValue(s.charAt(i))));
            }
        }
        return res.toString();
    }

    private char shift(char c, int x) {
        return (char) (c + x);
    }
}
