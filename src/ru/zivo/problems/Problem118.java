package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/pascals-triangle
 * Title: 118. Pascal's Triangle
 * Difficulty: Easy
 */
public class Problem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> prev = result.get(result.size() - 1);
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for (int j = 0; j < prev.size(); j++) {
                if (j + 1 != prev.size()) {
                    newList.add(prev.get(j) + prev.get(j + 1));
                }
            }
            newList.add(1);
            result.add(newList);
        }
        return result;
    }
}
