package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/single-number
 * Title: 136. Single Number
 * Difficulty: Easy
 */
public class Problem136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> iie : map.entrySet()) {
            if (iie.getValue() == 1) {
                return iie.getKey();
            }
        }

        return 0;
    }
}
