package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits
 * Title: 2160. Minimum Sum of Four Digit Number After Splitting Digits
 * Difficulty: Easy
 */
public class Problem2160 {
    public int minimumSum(int num) {
        List<Integer> list = new ArrayList<>();

        for (; num > 0; num /= 10) {
            list.add(num % 10);
        }

        Collections.sort(list);

        int a = (list.get(0) * 10) + list.get(2);
        int b = (list.get(1) * 10) + list.get(3);

        return a + b;
    }
}
