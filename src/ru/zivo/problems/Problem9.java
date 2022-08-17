package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/palindrome-number
 * Author : Zimin Vladimir
 * Date   : 2022-07-23
 */
public class Problem9 {
    public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}
