package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet
 * Title: 2194. Cells in a Range on an Excel Sheet
 * Difficulty: Easy
 */
public class Problem2194 {
    public List<String> cellsInRange(String s) {
        char startC = s.charAt(0);
        int startI =  Character.getNumericValue(s.charAt(1));
        char endC = s.charAt(3);
        int endI = Character.getNumericValue(s.charAt(4));

        List<String> res = new ArrayList<>();

        while (startC <= endC) {
            for (int i = startI; i <= endI; i++) {
                res.add(String.valueOf(startC) + i);
            }
            startC++;
        }

        return res;
    }
}
