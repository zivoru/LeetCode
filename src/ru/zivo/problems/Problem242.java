package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/valid-anagram
 * Title: 242. Valid Anagram
 * Difficulty: Easy
 */
public class Problem242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] numbers = new int[26];
        for (int i = 0; i < s.length(); i++) {
            numbers[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            if (numbers[t.charAt(i) - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
}
