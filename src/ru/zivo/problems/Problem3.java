package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/longest-substring-without-repeating-characters
 * Title: 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i), start) != i) {
                start = s.indexOf(s.charAt(i), start) + 1;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
