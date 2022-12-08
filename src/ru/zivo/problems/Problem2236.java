package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/root-equals-sum-of-children
 * Title: 2236. Root Equals Sum of Children
 * Difficulty: Easy
 */
public class Problem2236 {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
