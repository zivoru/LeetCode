package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Source: https://leetcode.com/problems/symmetric-tree
 * Title: 101. Symmetric Tree
 * Difficulty: Easy
 */
public class Problem101 {
    public boolean isSymmetric(TreeNode root) {
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        recursionLeft(root.left, leftList);
        recursionRight(root.right, rightList);
        if (leftList.size() != rightList.size()) return false;
        for (int i = 0; i < leftList.size(); i++) {
            if (!Objects.equals(leftList.get(i), rightList.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void recursionLeft(TreeNode root, List<Integer> leftList) {
        if (root != null) {
            leftList.add(root.val);
            recursionLeft(root.left, leftList);
            recursionLeft(root.right, leftList);
        } else leftList.add(null);
    }

    private void recursionRight(TreeNode root, List<Integer> rightList) {
        if (root != null) {
            rightList.add(root.val);
            recursionRight(root.right, rightList);
            recursionRight(root.left, rightList);
        } else rightList.add(null);
    }
}
