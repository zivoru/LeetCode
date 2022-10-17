package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/contains-duplicate-ii
 * Title: 219. Contains Duplicate II
 * Difficulty: Easy
 */
public class Problem219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
