package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/maximum-69-number
 * Title: 1323. Maximum 69 Number
 * Difficulty: Easy
 */
public class Problem1323 {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        int res = 0;
        boolean b = true;
        for (char c : s.toCharArray()) {
            if (b && c == '6') {
                res = res * 10 + 9;
                b = false;
            } else {
                res = res * 10 + Character.getNumericValue(c);
            }
        }
        return res;
    }
}
