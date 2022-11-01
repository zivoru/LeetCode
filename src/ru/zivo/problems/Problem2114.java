package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences
 * Title: 2114. Maximum Number of Words Found in Sentences
 * Difficulty: Easy
 */
public class Problem2114 {
    public int mostWordsFound(String[] sentences) {
        int ans = 1;
        for (String sentence : sentences) {
            int count = 1;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }
            if (count > ans) {
                ans = count;
            }
        }
        return ans;
    }
}
