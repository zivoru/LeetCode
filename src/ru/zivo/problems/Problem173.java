package ru.zivo.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/binary-search-tree-iterator
 * Title: 173. Binary Search Tree Iterator
 * Difficulty: Medium
 */
public class Problem173 {
    class BSTIterator {
        List<Integer> list = new ArrayList<>();
        int curr = -1;

        public BSTIterator(TreeNode root) {
            recursion(root);
            Collections.sort(list);
        }

        private void recursion(TreeNode root) {
            if (root != null) {
                list.add(root.val);
                recursion(root.left);
                recursion(root.right);
            }
        }

        public int next() {
            return hasNext() ? list.get(++curr) : -1;
        }

        public boolean hasNext() {
            return (curr + 1) < list.size();
        }
    }
}
