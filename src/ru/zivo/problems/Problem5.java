package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/longest-palindromic-substring
 * Title: 5. Longest Palindromic Substring
 * Difficulty: Medium
 */
public class Problem5 {
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (result.length() > s.length() / 2 || result.length() > s.length() - i) break;
            int index = s.lastIndexOf(s.charAt(i));
            while (index != i) {
                if (result.length() < index - i) {
                    boolean add = true;
                    int left = i;
                    int right = index;
                    while (left < right) {
                        if (s.charAt(left) != s.charAt(right)) {
                            add = false;
                            break;
                        }
                        left++;
                        right--;
                    }
                    if (add && s.substring(i, index + 1).length() > result.length()) {
                        result = s.substring(i, index + 1);
                        break;
                    }
                }
                index = s.lastIndexOf(s.charAt(i), index - 1);
            }
        }
        if (result.length() < 1) {
            result = String.valueOf(s.charAt(0));
        }
        return result.length() == 0 ? null : result;
    }
}
