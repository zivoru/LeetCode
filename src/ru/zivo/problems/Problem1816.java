package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/truncate-sentence
 * Title: 1816. Truncate Sentence
 * Difficulty: Easy
 */
public class Problem1816 {
    public String truncateSentence(String s, int k) {
        int i = 0, kk = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (++kk == k) break;
            }
        }
        return s.substring(0, i);
    }
}
