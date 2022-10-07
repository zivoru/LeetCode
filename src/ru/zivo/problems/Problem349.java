package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/intersection-of-two-arrays
 * Title: 349. Intersection of Two Arrays
 * Difficulty: Easy
 */
public class Problem349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                set2.add(i);
            }
        }

        int[] res = new int[set2.size()];

        int j = 0;
        for (int num : set2) {
            res[j++] = num;
        }
        return res;
    }
}
