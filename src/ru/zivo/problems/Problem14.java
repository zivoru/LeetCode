package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/longest-common-prefix
 * Title: 14. Longest Common Prefix
 * Difficulty: Easy
 */
public class Problem14 {
    public static String longestCommonPrefix(String[] strs) {
        int lengthPrefix = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, lengthPrefix);
                }
            }
            lengthPrefix++;
        }
        return strs[0].substring(0, lengthPrefix);
    }
}
