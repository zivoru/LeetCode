package ru.zivo.problems;

import java.util.Objects;

/**
 * Source: https://leetcode.com/problems/string-to-integer-atoi
 * Title: 8. String to Integer (atoi)
 * Difficulty: Medium
 */
public class Problem8 {
    public int myAtoi(String s) {
        Long res = null;
        Boolean isNegative = null;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (res != null || isNegative != null) {
                    break;
                }
            } else if (c == '-' || c == '+') {
                if (res == null) {
                    if (isNegative == null) {
                        isNegative = (c == '-');
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else if (c > 47 && c < 58) {
                if (res == null) {
                    res = (long) (c - 48);
                } else {
                    res = (res * 10) + (long) (c - 48);

                    System.out.println(res);
                    if (isNegative != null && isNegative && -res < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    } else if (res > Integer.MAX_VALUE) {
                        if (isNegative == null || !isNegative) {
                            return Integer.MAX_VALUE;
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (res == null) {
            return 0;
        } else {
            return (int) (isNegative != null && Objects.equals(Boolean.TRUE, isNegative) ? -res : res);
        }
    }
}
