package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/palindrome-number
 * Author : Zimin Vladimir
 * Date   : 2022-07-23
 */
public class Problem9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0;
        for (int i = x; i != 0; i /= 10)
            reversed = (i % 10) + (reversed * 10);
        return x == reversed;
    }
}
