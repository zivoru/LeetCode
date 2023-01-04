package ru.zivo.problems;

import java.util.Map;
import java.util.TreeMap;

/**
 * Source: https://leetcode.com/problems/sort-the-people
 * Title: 2418. Sort the People
 * Difficulty: Easy
 */
public class Problem2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        int length = heights.length;
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < length; i++) {
            map.put(heights[i], names[i]);
        }
        String[] res = new String[length];
        int j = length - 1;
        for (String value : map.values()) {
            res[j--] = value;
        }
        return res;
    }
}
