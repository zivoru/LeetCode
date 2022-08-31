package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/same-tree
 * Title: 100. Same Tree
 * Difficulty: Easy
 */
public class Problem100 {
    static boolean same = true;

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) {
                same = false;
            } else {
                same = isSameTree(p.left, q.left);
                same = isSameTree(p.right, q.right);
            }
        } else if (p != null || q != null) {
            same = false;
        }
        return same;
    }
}
