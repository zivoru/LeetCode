package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/remove-all-occurrences-of-a-substring
 * Title: 1910. Remove All Occurrences of a Substring
 * Difficulty: Medium
 */
public class Problem1910 {
    public String removeOccurrences(String s, String part) {
        int i = s.indexOf(part);
        while (i != -1) {
            s = s.replaceFirst(part, "");
            i = s.indexOf(part);
        }
        return s;
    }
}
