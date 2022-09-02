package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/is-subsequence
 * Title: 392. Is Subsequence
 * Difficulty: Easy
 */
public class Problem392 {
    public static boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < t.length() && index < s.length(); i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
        }
        return index == s.length();
    }
}
