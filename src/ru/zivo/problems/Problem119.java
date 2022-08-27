package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/pascals-triangle-ii
 * Title: 119. Pascal's Triangle II
 * Difficulty: Easy
 */
public class Problem119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = List.of(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 0; j < result.size(); j++) {
                if (j + 1 != result.size()) {
                    newRow.add(result.get(j) + result.get(j + 1));
                }
            }
            newRow.add(1);
            result = new ArrayList<>(newRow);
        }
        return result;
    }
}
