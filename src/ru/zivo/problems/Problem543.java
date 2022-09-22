package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/diameter-of-binary-tree
 * Title: 543. Diameter of Binary Tree
 * Difficulty: Easy
 */
public class Problem543 {
    int length = 0, leftMax = 0, rightMax = 0, res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            recursion(root.left, true);
            recursion(root.right, false);
            if ((leftMax + rightMax) > res) {
                res = leftMax + rightMax;
            }
            leftMax = 0;
            rightMax = 0;
            diameterOfBinaryTree(root.left);
            diameterOfBinaryTree(root.right);
        }
        return res;
    }

    private void recursion(TreeNode root, boolean b) {
        if (root != null) {
            length++;
            recursion(root.left, b);
            recursion(root.right, b);
            length--;
        } else {
            if (b && length > leftMax) leftMax = length;
            if (!b && length > rightMax) rightMax = length;
        }
    }
}
