package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/intersection-of-two-arrays-ii
 * Title: 350. Intersection of Two Arrays II
 * Difficulty: Easy
 */
public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numbers = new int[1001];
        for (int i : nums1) {
            numbers[i]++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (numbers[i] > 0) {
                list.add(i);
                numbers[i]--;
            }
        }
        int[] res = new int[list.size()];
        int j = 0;
        for (int num : list) {
            res[j++] = num;
        }
        return res;
    }
}
