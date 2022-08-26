package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/reordered-power-of-2
 * Title: 869. Reordered Power of 2
 * Difficulty: Medium
 */
public class Problem869 {
    public boolean reorderedPowerOf2(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i != 0; i *= 2) {
            char[] chars1 = String.valueOf(i).toCharArray();
            Arrays.sort(chars1);
            if (Arrays.equals(chars, chars1)) return true;
        }
        return false;
    }
}
