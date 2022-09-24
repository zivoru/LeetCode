package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
 * Title: 108. Convert Sorted Array to Binary Search Tree
 * Difficulty: Easy
 */
public class Problem108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int half = nums.length / 2;
        TreeNode res = new TreeNode(nums[half]);
        Set<Integer> used = new HashSet<>();
        used.add(half);
        fill(res, 0, half, nums, used);
        fill(res, half, nums.length, nums, used);
        return res;
    }

    private void fill(TreeNode res, int left, int right, int[] nums, Set<Integer> used) {
        int quarter = left + ((right - left) / 2);
        if (!used.contains(quarter)) {
            TreeNode newTree = new TreeNode(nums[quarter]);
            used.add(quarter);
            fill(newTree, quarter, right, nums, used);
            fill(newTree, left, quarter, nums, used);
            if (nums[quarter] > res.val) {
                res.right = newTree;
            } else {
                res.left = newTree;
            }
        }
    }
}
