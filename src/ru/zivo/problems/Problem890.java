package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/find-and-replace-pattern
 * Title: 890. Find and Replace Pattern
 * Difficulty: Medium
 */
public class Problem890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] ints = convertToArray(pattern);
        List<String> res = new ArrayList<>();
        for (String word : words) {
            int[] ints2 = convertToArray(word);
            if (Arrays.equals(ints, ints2)) {
                res.add(word);
            }
        }
        return res;
    }

    private int[] convertToArray(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int[] res = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            res[i] = map.getOrDefault(word.charAt(i), i);
            map.putIfAbsent(word.charAt(i), i);
        }
        return res;
    }
}
