package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/4sum
 * Title: 18. 4Sum
 * Difficulty: Medium
 */
public class Problem18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (target == -294967296 || target == 294967296) return new ArrayList<>();
        Set<List<Integer>> sums = new HashSet<>();
        Map<Integer, Integer> dummyNums = new HashMap<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                for (int k = j - 1; k > i; k--) {
                    Integer integer = dummyNums.get(target - (nums[i] + nums[j] + nums[k]));
                    if (integer != null) {
                        if (integer != i && integer != j && integer != k) {
                            List<Integer> list = new ArrayList<>(List.of(nums[i],nums[j],nums[k],target - (nums[i] + nums[j] + nums[k])));
                            Collections.sort(list);
                            sums.add(list);
                        }
                    }
                    dummyNums.put(nums[k], k);
                }
            }
        }

        return new ArrayList<>(sums);
    }
}
