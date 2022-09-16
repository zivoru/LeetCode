package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/happy-number
 * Title: 202. Happy Number
 * Difficulty: Easy
 */
public class Problem202 {
    Set<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        set.add(n);
        int sum = 0;
        for (; n > 0; n /= 10) sum += (n % 10) * (n % 10);
        return sum == 1 || (!set.contains(sum) && isHappy(sum));
    }
}
