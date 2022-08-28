package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/minimum-depth-of-binary-tree
 * Title: 111. Minimum Depth of Binary Tree
 * Difficulty: Easy
 */
public class Problem111 {
    int minDepth = 0;

    public int minDepth(TreeNode root) {
        recursion(root);
        return minDepth;
    }

    int depth = 0;

    private void recursion(TreeNode root) {
        if (root != null) {
            depth++;
            if (depth < minDepth || minDepth == 0) {
                if (root.left == null && root.right == null) {
                    minDepth = depth;
                }
                recursion(root.left);
                recursion(root.right);
            }
            depth--;
        }
    }
}
