package ru.zivo.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/permutations-ii/
 * Title: 47. Permutations II
 * Difficulty: Medium
 */
public class Problem47 {
    Set<List<Integer>> set = new HashSet<>();
    List<Integer> subList = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        recursion(nums);
        return new ArrayList<>(set);
    }

    int[] ints = new int[8];

    private void recursion(int[] nums) {
        if (subList.size() == nums.length) {
            set.add(new ArrayList<>(subList));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (ints[j] == 0) {
                ints[j] = -1;
                subList.add(nums[j]);
                recursion(nums);
                ints[j] = 0;
                subList.remove(subList.size() - 1);
            }
        }
    }
}
