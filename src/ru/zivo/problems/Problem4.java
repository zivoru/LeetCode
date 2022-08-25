package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/median-of-two-sorted-arrays
 * Title: 4. Median of Two Sorted Arrays
 * Difficulty: Hard
 */
public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1l = nums1.length, n2l = nums2.length, size = n1l + n2l;
        boolean even = size % 2 != 0;
        double value1 = -1, value2 = -1;
        int half = (int) (size * 0.5), c;

        for (int i = 0, j = 0, k = 0; i < n1l || j < n2l; k++) {
            if (i < n1l && j < n2l) {
                if (nums1[i] < nums2[j]) c = nums1[i++];
                else c = nums2[j++];
            } else if (i < n1l) c = nums1[i++];
            else c = nums2[j++];

            if (even && k == half) return c;
            if (!even) {
                if (k == half) value1 = c;
                if (k == half - 1) value2 = c;
            }
            if (value1 != -1 && value2 != -1) return (value1 + value2) / 2;
        }

        return 0;
    }
}
