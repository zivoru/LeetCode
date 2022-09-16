package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/longest-repeating-character-replacement
 * Title: 424. Longest Repeating Character Replacement
 * Difficulty: Medium
 */
public class Problem424 {
    public int characterReplacement(String s, int k) {
        int[] quantity = new int[91];
        int left = 0, maxCount = 0, result = 0;
        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(++quantity[s.charAt(right)], maxCount);
            if (right - left + 1 - maxCount > k)
                quantity[s.charAt(left++)]--;
            result = Math.max(right - left + 1, result);
        }
        return result;
    }
}
