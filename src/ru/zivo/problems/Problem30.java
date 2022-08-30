package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/substring-with-concatenation-of-all-words
 * Title: 30. Substring with Concatenation of All Words
 * Difficulty: Hard
 */
public class Problem30 {
    public List<Integer> findSubstring(String s, String[] words) {
        if (s.length() < words[0].length() * words.length) {
            return new ArrayList<>();
        }

        int length = words[0].length();

        Map<String, Integer> wordsAndCount = new HashMap<>();
        for (String word : words) {
            wordsAndCount.put(word, wordsAndCount.getOrDefault(word, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        String substring;
        Map<String, Integer> clone;

        for (int i = 0; i < s.length() - length * words.length + 1; i++) {
            substring = s.substring(i, i + length);

            if (wordsAndCount.containsKey(substring)) {
                clone = new HashMap<>(wordsAndCount);
                clone.put(substring, clone.get(substring) - 1);

                boolean add = true;

                for (int j = 1; j < words.length; j++) {
                    substring = s.substring(i + length * j, i + length * j + length);

                    if (!clone.containsKey(substring) || clone.get(substring) == 0) {
                        add = false;
                        break;
                    } else {
                        clone.put(substring, clone.get(substring) - 1);
                    }
                }

                if (add) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
