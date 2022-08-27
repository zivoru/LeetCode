package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/valid-palindrome
 * Title: 125. Valid Palindrome
 * Difficulty: Easy
 */
public class Problem125 {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("\\W*_*", "").toLowerCase();
        return s1.equals(new StringBuilder(s1).reverse().toString());
    }
}
