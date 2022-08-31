package ru.zivo.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/binary-tree-inorder-traversal
 * Title: 94. Binary Tree Inorder Traversal
 * Difficulty: Easy
 */
public class Problem94 {
    public Set<Integer> result = new HashSet<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            result.add(root.val);
            inorderTraversal(root.right);
        }
        return new ArrayList<>(result);
    }
}
