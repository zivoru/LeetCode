package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/delete-greatest-value-in-each-row
 * Title: 2500. Delete Greatest Value in Each Row
 * Difficulty: Easy
 */
public class Problem2500 {
    public int deleteGreatestValue(int[][] grid) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] array : grid) {
            List<Integer> list = new ArrayList<>();
            for (int value : array) {
                list.add(value);
            }
            list.sort(Comparator.reverseOrder());
            lists.add(list);
        }

        int res = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (List<Integer> list : lists) {
                max = Math.max(list.get(i), max);
            }
            res += max;
        }
        return res;
    }
}
