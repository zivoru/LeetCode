package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/permutations
 * Title: 46. Permutations
 * Difficulty: Medium
 */
public class Problem46 {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subList = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        recursion(nums);
        return list;
    }

    int[] ints = new int[6];

    private void recursion(int[] nums) {
        if (subList.size() == nums.length) {
            list.add(new ArrayList<>(subList));
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
