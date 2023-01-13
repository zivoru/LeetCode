package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/evaluate-boolean-binary-tree
 * Title: 2331. Evaluate Boolean Binary Tree
 * Difficulty: Easy
 */
public class Problem2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val == 1;
        } else if (root.left == null) {
            return evaluateTree(root.right);
        } else if (root.right == null) {
            return evaluateTree(root.left);
        } else {
            boolean left = evaluateTree(root.left);
            boolean right = evaluateTree(root.right);
            return root.val == 2 ? left || right : left && right;
        }
    }
}
