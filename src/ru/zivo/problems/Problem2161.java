package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/partition-array-according-to-given-pivot
 * Title: 2161. Partition Array According to Given Pivot
 * Difficulty: Medium
 */
public class Problem2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int size = nums.length;
        int[] ans = new int[size];
        int left = 0, right = size - 1, i = 0, j = size - 1, count = 0;

        while (right >= 0) {
            if (nums[left] < pivot) {
                ans[i++] = nums[left];
            } else if (nums[left] == pivot) {
                count++;
            }

            if (nums[right] > pivot) {
                ans[j--] = nums[right];
            }

            left++;
            right--;
        }

        for (; count > 0; count--) {
            ans[i++] = pivot;
        }

        return ans;
    }
}
