package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/to-lower-case
 * Title: 709. To Lower Case
 * Difficulty: Easy
 */
public class Problem709 {
    public String toLowerCase(String s) {
        var res = new StringBuilder();
        for (char c : s.toCharArray()) {
            res.append((char) (c > 64 && c < 91 ? c + 32 : c));
        }
        return res.toString();
    }
}
