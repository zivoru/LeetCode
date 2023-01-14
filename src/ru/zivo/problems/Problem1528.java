package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/shuffle-string
 * Title: 1528. Shuffle String
 * Difficulty: Easy
 */
public class Problem1528 {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        int i = 0;
        for (int index : indices) {
            chars[index] = s.charAt(i++);
        }
        return new String(chars);
    }
}
