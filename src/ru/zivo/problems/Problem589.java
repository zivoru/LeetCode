package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/n-ary-tree-preorder-traversal
 * Title: 589. N-ary Tree Preorder Traversal
 * Difficulty: Easy
 */
public class Problem589 {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }

    public void recursion(Node root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            for (Node node : root.children) {
                recursion(node, result);
            }
        }
    }
}
