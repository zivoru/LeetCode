package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/median-of-two-sorted-arrays
 * Title: 4. Median of Two Sorted Arrays
 * Difficulty: Hard
 */
public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length, length2 = nums2.length, size = length1 + length2;
        boolean even = size % 2 != 0;
        double value1 = -1, value2 = -1;
        int half = (int) (size * 0.5), curr;

        for (int i = 0, j = 0, k = 0; i < length1 || j < length2; k++) {
            if (i < length1 && j < length2) {
                if (nums1[i] < nums2[j]) {
                    curr = nums1[i++];
                } else {
                    curr = nums2[j++];
                }
            } else if (i < length1) {
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }

            if (even && k == half) {
                return curr;
            }

            if (!even) {
                if (k == half) {
                    value1 = curr;
                }
                if (k == half - 1) {
                    value2 = curr;
                }
            }

            if (value1 != -1 && value2 != -1) {
                return (value1 + value2) / 2;
            }
        }

        return 0;
    }
}
