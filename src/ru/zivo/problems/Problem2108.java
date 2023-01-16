package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-first-palindromic-string-in-the-array
 * Title: 2108. Find First Palindromic String in the Array
 * Difficulty: Easy
 */
public class Problem2108 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (word.equals(new StringBuilder(word).reverse().toString())) {
                return word;
            }
        }
        return "";
    }
}
