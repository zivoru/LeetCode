package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree
 * Title: 235. Lowest Common Ancestor of a Binary Search Tree
 * Difficulty: Medium
 */
public class Problem235 {
    boolean found = false;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        search(root, p, pathP);
        found = false;
        Set<TreeNode> pathQ = new HashSet<>();
        search(root, q, pathQ);
        if (pathQ.contains(p)) return p;
        if (pathP.contains(q)) return q;
        for (int i = pathP.size() - 1; i >= 0; i--) {
            if (pathQ.contains(pathP.get(i))) {
                return pathP.get(i);
            }
        }
        return null;
    }

    private void search(TreeNode root, TreeNode p, java.util.Collection<TreeNode> path) {
        if (root == p) {
            found = true;
            return;
        }
        if (root != null) {
            path.add(root);
            search(root.left, p, path);
            if (!found) {
                path.remove(root.left);
                search(root.right, p, path);
                if (!found)
                    path.remove(root.right);
            }
        }
    }
}
