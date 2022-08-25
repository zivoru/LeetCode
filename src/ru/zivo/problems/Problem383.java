package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/ransom-note
 * Title: 383. Ransom Note
 * Difficulty: Easy
 */
public class Problem383 {
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
