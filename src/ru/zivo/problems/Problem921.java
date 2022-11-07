package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid
 * Title: 921. Minimum Add to Make Parentheses Valid
 * Difficulty: Medium
 */
public class Problem921 {
    public int minAddToMakeValid(String s) {
        int l = 0, r = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                l++;
            } else {
                if (l > 0) {
                    l--;
                } else {
                    r++;
                }
            }
        }
        return l + r;
    }
}
