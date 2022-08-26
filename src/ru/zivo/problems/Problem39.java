package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/combination-sum
 * Title: 39. Combination Sum
 * Difficulty: Medium
 */
public class Problem39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int[] ints = new int[201];
        for (int candidate : candidates) {
            int j = 0;
            for (int k = candidate; k <= target; j++) {
                k += candidate;
            }
            ints[candidate] = j;
        }
        List<Integer> sublist = new LinkedList<>();
        int sum = 0;
        recursion(candidates, target, result, ints, sublist, sum, 0);
        return result;
    }

    private void recursion(int[] candidates, int target, List<List<Integer>> result,
                           int[] ints, List<Integer> sublist, int sum, int i) {
        if (sum > target) {
            return;
        } else if (sum == target) {
            ArrayList<Integer> e = new ArrayList<>(sublist);
            Collections.sort(e);
            result.add(e);
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            int candidate = candidates[j];
            if (ints[candidate] != 0) {
                ints[candidate] = ints[candidate] - 1;
                sublist.add(candidate);
                sum += candidate;
                recursion(candidates, target, result, ints, sublist, sum, j);
                ints[candidate] = ints[candidate] + 1;
                sublist.remove(sublist.size() - 1);
                sum -= candidate;
            }
        }
    }
}
