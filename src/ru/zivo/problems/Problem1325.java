package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/delete-leaves-with-a-given-value
 * Title: 1325. Delete Leaves With a Given Value
 * Difficulty: Medium
 */
public class Problem1325 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        recursion(root.left, root, true, target);
        recursion(root.right, root, false, target);
        if (root.val == target) {
            if (root.left == null && root.right == null) {
                root = null;
            }
        }
        return root;
    }

    private void recursion(TreeNode root, TreeNode prev, boolean direction, int target) {
        if (root != null) {
            if (root.val == target) {
                if (root.left == null && root.right == null) {
                    if (direction) {
                        prev.left = null;
                    } else {
                        prev.right = null;
                    }
                } else {
                    recursion(root.left, root, true, target);
                    recursion(root.right, root, false, target);
                    if (root.left == null && root.right == null) {
                        if (direction) {
                            prev.left = null;
                        } else {
                            prev.right = null;
                        }
                    }
                }
            } else {
                recursion(root.left, root, true, target);
                recursion(root.right, root, false, target);
            }
        }
    }
}
