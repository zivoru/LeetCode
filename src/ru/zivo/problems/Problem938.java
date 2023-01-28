package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/range-sum-of-bst
 * Title: 938. Range Sum of BST
 * Difficulty: Easy
 */
public class Problem938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int curr = root.val >= low && root.val <= high ? root.val : 0;
        int left = root.val > low ? rangeSumBST(root.left, low, high) : 0;
        int right = root.val <= high ? rangeSumBST(root.right, low, high) : 0;

        return curr + left + right;
    }
}
