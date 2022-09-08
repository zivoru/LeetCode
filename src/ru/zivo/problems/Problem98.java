package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/validate-binary-search-tree
 * Title: 98. Validate Binary Search Tree
 * Difficulty: Medium
 */
public class Problem98 {
    public boolean valid = true;

    public boolean isValidBST(TreeNode root) {
        recursion(root);
        return valid;
    }

    public int value = 0;

    public void recursion(TreeNode root) {
        if (valid && root != null) {
            value = root.val;
            recursion2(root.left, true);
            if (valid) recursion2(root.right, false);
            if (valid) recursion(root.left);
            if (valid) recursion(root.right);
        }
    }

    public void recursion2(TreeNode root, boolean left) {
        if (valid && root != null) {
            if (left && root.val >= value) valid = false;
            if (!left && root.val <= value) valid = false;
            if (valid) recursion2(root.left, left);
            if (valid) recursion2(root.right, left);
        }
    }
}
