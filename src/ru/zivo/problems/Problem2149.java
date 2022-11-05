package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/rearrange-array-elements-by-sign
 * Title: 2149. Rearrange Array Elements by Sign
 * Difficulty: Medium
 */
public class Problem2149 {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> opposites = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        for (int num : nums) {
            if (num > 0) {
                positive.add(num);
            } else {
                opposites.add(num);
            }
        }
        int[] ans = new int[nums.length];
        int o = 0, p = 0;
        for (int i = 0; i < ans.length; i++) {
            if (i % 2 == 0) {
                ans[i] = positive.get(p++);
            } else {
                ans[i] = opposites.get(o++);
            }
        }
        return ans;
    }
}
