package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/maximum-depth-of-binary-tree
 * Title: 104. Maximum Depth of Binary Tree
 * Difficulty: Easy
 */
public class Problem104 {
    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        recursion(root);
        return maxDepth;
    }

    int depth = 0;

    private void recursion(TreeNode root) {
        if (root != null) {
            depth++;
            if (root.left == null && root.right == null && depth > maxDepth) {
                maxDepth = depth;
            }
            recursion(root.left);
            recursion(root.right);
            depth--;
        }
    }
}
