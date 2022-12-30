package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/count-asterisks
 * Title: 2315. Count Asterisks
 * Difficulty: Easy
 */
public class Problem2315 {
    public int countAsterisks(String s) {
        int count = 0;
        boolean b = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && b) {
                count++;
            }
            if (s.charAt(i) == '|') {
                b = !b;
            }
        }
        return count;
    }
}
