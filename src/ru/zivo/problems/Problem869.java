package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/reordered-power-of-2
 * Title: 869. Reordered Power of 2
 * Difficulty: Medium
 */
public class Problem869 {
    public boolean reorderedPowerOf2(int n) {
        for (int i = 1; i != 0; i <<= 1) {
            String s = String.valueOf(n);
            String s1 = String.valueOf(i);
            if (s.length() != s1.length()) continue;
            if (s.length() < s1.length()) return false;
            if (canConstruct(s, s1)) return true;
        }
        return false;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[123];
        for (char c : magazine.toCharArray()) {
            chars[c] += 1;
        }
        for (char c : ransomNote.toCharArray()) {
            if (chars[c] == 0) return false;
            chars[c] -= 1;
        }
        return true;
    }
}
