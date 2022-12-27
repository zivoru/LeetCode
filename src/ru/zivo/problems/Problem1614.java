package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses
 * Title: 1614. Maximum Nesting Depth of the Parentheses
 * Difficulty: Easy
 */
public class Problem1614 {
    public int maxDepth(String s) {
        int max = 0, curr = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                curr++;
                if (curr > max) {
                    max = curr;
                }
            } else if (c == ')') {
                curr--;
            }
        }
        return max;
    }
}
