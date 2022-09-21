package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/balanced-binary-tree
 * Title: 110. Balanced Binary Tree
 * Difficulty: Easy
 */
public class Problem110 {
    public boolean isBalanced(TreeNode root) {
        return help(root).isBalanced;
    }

    static class Helper {
        int ht;
        boolean isBalanced;
    }

    public Helper help(TreeNode root) {
        if (root == null) {
            Helper h = new Helper();
            h.ht = 0;
            h.isBalanced = true;
            return h;
        }

        Helper left = help(root.left);
        Helper right = help(root.right);
        Helper h = new Helper();
        h.ht = 1 + Math.max(left.ht, right.ht);
        int reqHt = left.ht - right.ht;
        h.isBalanced = left.isBalanced && right.isBalanced && (reqHt == 1 || reqHt == 0 || reqHt == -1);

        return h;
    }
}
