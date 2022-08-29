package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/binary-tree-level-order-traversal
 * Title: 102. Binary Tree Level Order Traversal
 * Difficulty: Medium
 */
public class Problem102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }

    int level = 0;

    private void recursion(TreeNode root, List<List<Integer>> result) {
        if (root != null) {
            if (level == result.size()) {
                result.add(new ArrayList<>(List.of(root.val)));
            } else {
                result.get(level).add(root.val);
            }
            level++;
            recursion(root.left, result);
            recursion(root.right, result);
            level--;
        }
    }
}
