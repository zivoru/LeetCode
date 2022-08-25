package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/two-sum
 * Title: 1. Two Sum
 * Difficulty: Easy
 */
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
