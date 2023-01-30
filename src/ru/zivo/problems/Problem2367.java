package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/number-of-arithmetic-triplets
 * Title: 2367. Number of Arithmetic Triplets
 * Difficulty: Easy
 */
public class Problem2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>(), set2 = new HashSet<>();
        int i = 0, count = 0;
        for (int num : nums) {
            if (!set2.contains(i) && set.contains(num - diff)) {
                int prev = num;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] - prev == diff) {
                        count++;
                        prev = nums[j];
                        set2.add(j);
                    }
                    if (nums[j] - prev > diff) {
                        break;
                    }
                }
            }
            set.add(num);
            i++;
        }

        return count;
    }
}
