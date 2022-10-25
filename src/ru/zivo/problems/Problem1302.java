package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/deepest-leaves-sum
 * Title: 1302. Deepest Leaves Sum
 * Difficulty: Medium
 */
public class Problem1302 {
    public int deepestLeavesSum(TreeNode root) {
        Map<Integer, Integer> deepestLeaves = new HashMap<>();
        recursion(root, deepestLeaves);
        int maxDeep = 0;
        for (int deep : deepestLeaves.keySet()) {
            if (deep > maxDeep) {
                maxDeep = deep;
            }
        }
        return deepestLeaves.get(maxDeep);
    }

    private int deep = 0;

    private void recursion(TreeNode root, Map<Integer, Integer> deepestLeaves) {
        if (root != null) {
            deep++;
            if (root.right == null && root.left == null) {
                deepestLeaves.put(deep, deepestLeaves.getOrDefault(deep, 0) + root.val);
            } else {
                recursion(root.left, deepestLeaves);
                recursion(root.right, deepestLeaves);
            }
            deep--;
        }
    }
}
