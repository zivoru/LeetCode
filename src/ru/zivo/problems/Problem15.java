package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/3sum
 * Title: 15. 3Sum
 * Difficulty: Medium
 */
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sums = new HashSet<>();
        Map<Integer, Integer> dummyNums = new HashMap<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                Integer integer = dummyNums.get(-(nums[i] + nums[j]));
                if (integer != null) {
                    if (integer != i && integer != j) {
                        List<Integer> list = new ArrayList<>(List.of(nums[i],nums[j],-(nums[i] + nums[j])));
                        Collections.sort(list);
                        sums.add(list);
                    }
                }
                dummyNums.put(nums[j], j);
            }
        }

        return new ArrayList<>(sums);
    }
}
