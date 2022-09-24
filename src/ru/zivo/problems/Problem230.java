package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/kth-smallest-element-in-a-bst
 * Title: 230. Kth Smallest Element in a BST
 * Difficulty: Medium
 */
public class Problem230 {
    Integer result, num;

    public int kthSmallest(TreeNode root, int k) {
        num = k;
        recursion(root);
        return result;
    }

    private void recursion(TreeNode root) {
        if (result != null) return;
        if (root == null) return;
        recursion(root.left);
        if (--num == 0) result = root.val;
        recursion(root.right);
    }
}
