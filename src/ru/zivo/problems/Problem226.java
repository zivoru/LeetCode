package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/invert-binary-tree
 * Title: 226. Invert Binary Tree
 * Difficulty: Easy
 */
public class Problem226 {
    public TreeNode invertTree(TreeNode root) {
        recursion(root);
        return root;
    }

    private void recursion(TreeNode root) {
        if (root != null) {
            TreeNode left = root.left;
            root.left = root.right;
            root.right = left;
            recursion(root.left);
            recursion(root.right);
        }
    }
}
