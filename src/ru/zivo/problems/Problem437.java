package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/path-sum-iii
 * Title: 437. Path Sum III
 * Difficulty: Medium
 */
public class Problem437 {
    long sum = 0;
    int res = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root != null) {
            recursion(root, targetSum);
            pathSum(root.left, targetSum);
            pathSum(root.right, targetSum);
        }
        return res;
    }

    private void recursion(TreeNode root, int targetSum) {
        if (root != null) {
            sum += root.val;
            if (sum == targetSum) res++;
            recursion(root.left, targetSum);
            recursion(root.right, targetSum);
            sum -= root.val;
        }
    }
}
