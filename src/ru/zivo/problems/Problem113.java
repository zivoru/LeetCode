package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/path-sum-ii
 * Title: 113. Path Sum II
 * Difficulty: Medium
 */
public class Problem113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(root, targetSum, result);
        return result;
    }

    List<Integer> path = new ArrayList<>();
    int sum = 0;

    private void recursion(TreeNode root, int targetSum, List<List<Integer>> result) {
        if (root != null) {
            sum += root.val;
            path.add(root.val);
            if (sum == targetSum && root.left == null && root.right == null) {
                result.add(new ArrayList<>(path));
            }
            recursion(root.left, targetSum, result);
            recursion(root.right, targetSum, result);
            sum -= root.val;
            path.remove(path.size() - 1);
        }
    }
}
