package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/palindrome-number
 * Title: 9. Palindrome Number
 * Difficulty: Easy
 */
public class Problem9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int temp = x;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == x;
    }
}
