package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/merge-sorted-array
 * Author : Zimin Vladimir
 * Date   : 2022-08-19
 */
public class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1, n1 = m - 1, n2 = n - 1; i >= 0; i--) {
            if (n1 < 0) {
                nums1[i] = nums2[n2--];
            } else if (n2 < 0) {
                nums1[i] = nums1[n1--];
            } else if (nums1[n1] >= nums2[n2]) {
                nums1[i] = nums1[n1--];
            } else {
                nums1[i] = nums2[n2--];
            }
        }
    }
}
