package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/counting-words-with-a-given-prefix
 * Title: 2185. Counting Words With a Given Prefix
 * Difficulty: Easy
 */
public class Problem2185 {
    public int prefixCount(String[] words, String pref) {
        int result = 0;
        for (String s : words) {
            if (s.startsWith(pref)) {
                result++;
            }
        }
        return result;
    }
}
