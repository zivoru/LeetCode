package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/longest-repeating-character-replacement
 * Title: 424. Longest Repeating Character Replacement
 * Difficulty: Medium
 */
public class Problem424 {
    public int characterReplacement(String s, int k) {
        if (s.length() == 1) return 1;
        int[] array = new int[26];
        int start = 0, maxCount = 0, ans = 0;
        for (int end = 0; end < s.length(); end++) {
            array[s.charAt(end) - 'A']++;
            maxCount = Math.max(array[s.charAt(end) - 'A'], maxCount);
            if ((end - start + 1) - maxCount > k) {
                array[s.charAt(start) - 'A']--;
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
