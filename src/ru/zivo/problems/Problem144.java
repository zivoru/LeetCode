package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/binary-tree-preorder-traversal
 * Title: 144. Binary Tree Preorder Traversal
 * Difficulty: Easy
 */
public class Problem144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }
    }
}
