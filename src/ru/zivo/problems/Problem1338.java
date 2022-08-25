package ru.zivo.problems;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/reduce-array-size-to-the-half
 * Title: 1338. Reduce Array Size to The Half
 * Difficulty: Medium
 */
public class Problem1338 {
    public int minSetSize(int[] arr) {
        int[] ints = new int[100001];
        for (int i : arr) {
            ints[i]++;
        }
        Arrays.sort(ints);
        int size = arr.length;
        int count = 0;
        for (int i = ints.length - 1; i >= 0 && size > arr.length / 2; i--) {
            size = size - ints[i];
            count++;
        }
        return count;
    }
}
