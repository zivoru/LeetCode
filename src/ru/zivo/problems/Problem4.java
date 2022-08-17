package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/median-of-two-sorted-arrays
 * Author : Zimin Vladimir
 * Date   : 2022-08-15
 */
public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ints = new int[nums1.length + nums2.length];

        for (int i = 0, j = 0, k = 0; i < nums1.length || j < nums2.length; k++) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    ints[k] = nums1[i];
                    i++;
                } else {
                    ints[k] = nums2[j];
                    j++;
                }
            } else if (i < nums1.length) {
                ints[k] = nums1[i];
                i++;
            } else {
                ints[k] = nums2[j];
                j++;
            }
        }

        return ints.length % 2 != 0
                ? ints[(int) (ints.length * 0.5)]
                : ((double) ints[(int) (ints.length * 0.5)] + ints[(int) (ints.length * 0.5 - 1)]) / 2;
    }
}
