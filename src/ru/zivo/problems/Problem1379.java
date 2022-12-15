package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree
 * Title: 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * Difficulty: Easy
 */
public class Problem1379 {
    TreeNode ans = null;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        recursion(cloned, target.val);
        return ans;
    }

    private void recursion(TreeNode cloned, int val) {
        if (cloned != null && ans == null) {
            if (cloned.val == val) {
                ans = cloned;
            } else {
                recursion(cloned.left, val);
                if (ans == null) {
                    recursion(cloned.right, val);
                }
            }
        }
    }
}
