package ru.zivo.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/all-elements-in-two-binary-search-trees
 * Title: 1305. All Elements in Two Binary Search Trees
 * Difficulty: Medium
 */
public class Problem1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        recursion(root1, list);
        recursion(root2, list);
        Collections.sort(list);
        return list;
    }

    private void recursion(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            recursion(root.left, list);
            recursion(root.right, list);
        }
    }
}
