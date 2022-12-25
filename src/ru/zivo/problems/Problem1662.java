package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent
 * Title: 1662. Check If Two String Arrays are Equivalent
 * Difficulty: Easy
 */
public class Problem1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var sb1 = new StringBuilder();
        var sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
