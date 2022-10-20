package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/repeated-substring-pattern
 * Title: 459. Repeated Substring Pattern
 * Difficulty: Easy
 */
public class Problem459 {
    public boolean repeatedSubstringPattern(String s) {
        int a = 2, length = s.length();
        while (a <= length) {
            if (length % a == 0) {
                int endIndex = length / a;
                String substring = s.substring(0, endIndex);
                boolean res = true;
                for (int i = endIndex; i < length; i += endIndex) {
                    if (!s.substring(i, i + endIndex).equals(substring)) {
                        res = false;
                        break;
                    }
                }
                if (res) {
                    return true;
                }
            }
            a++;
        }
        return false;
    }
}
