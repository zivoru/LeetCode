package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/majority-element
 * Title: 169. Majority Element
 * Difficulty: Easy
 */
public class Problem169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int half = nums.length / 2;
        for (int num : nums) {
            int value = map.getOrDefault(num, 0) + 1;
            map.put(num, value);
            if (value > half) {
                return num;
            }
        }
        return 0;
    }
}
