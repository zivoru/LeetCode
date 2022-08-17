package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/longest-palindromic-substring
 * Author : Zimin Vladimir
 * Date   : 2022-08-15
 */
public class Problem5 {
    public static String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        String result = "";

        for (int d = 0; d < s.length(); d++) {
            for (int i = d; i < s.length(); i++) {
                String substring = s.substring(d, i + 1);
                if (substring.length() > result.length()) {
                    if (substring.equals(new StringBuilder(substring).reverse().toString())) {
                        result = substring;
                    }
                }
            }
        }

        return result.length() == 0 ? null : result;
    }
}
