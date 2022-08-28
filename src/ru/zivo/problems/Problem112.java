package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/path-sum
 * Title: 112. Path Sum
 * Difficulty: Easy
 */
public class Problem112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return recursion(root, targetSum);
    }

    boolean has = false;
    int sum = 0;

    private boolean recursion(TreeNode root, int targetSum) {
        if (root != null && !has) {
            sum += root.val;
            if (sum == targetSum && root.left == null && root.right == null) {
                has = true;
                return true;
            }
            recursion(root.left, targetSum);
            if (!has) {
                recursion(root.right, targetSum);
            }
            sum -= root.val;
        }
        return has;
    }
}
