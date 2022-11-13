package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/single-number-iii
 * Title: 260. Single Number III
 * Difficulty: Medium
 */
public class Problem260 {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        int[] ans = new int[2];
        int i = 0;
        for (Integer integer : set) {
            ans[i++] = integer;
        }
        return ans;
    }
}
