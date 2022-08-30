package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/first-missing-positive
 * Title: 41. First Missing Positive
 * Difficulty: Hard
 */
public class Problem41 {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer integer : nums) {
            if (integer > 0) set.add(integer);
        }
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) return i;
        }
        return 1;
    }
}
