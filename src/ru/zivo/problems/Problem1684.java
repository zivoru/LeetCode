package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/count-the-number-of-consistent-strings
 * Title: 1684. Count the Number of Consistent Strings
 * Difficulty: Easy
 */
public class Problem1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        int[] chars = new int[26];
        for (char c : allowed.toCharArray()) {
            chars[c - 'a']++;
        }
        add: for (String word : words) {
            for (char c : word.toCharArray()) {
                if (chars[c - 'a'] == 0) {
                    continue add;
                }
            }
            res++;
        }
        return res;
    }
}
