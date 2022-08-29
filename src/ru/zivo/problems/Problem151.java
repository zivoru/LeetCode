package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/reverse-words-in-a-string
 * Title: 151. Reverse Words in a String
 * Difficulty: Medium
 */
public class Problem151 {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();

        StringBuilder word = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                word.append(c);
            } else {
                if (!word.toString().equals("")) {
                    words.add(word.toString());
                }
                word.setLength(0);
            }
        }
        if (!word.toString().equals("")) {
            words.add(word.toString());
        }
        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
            if (i > 0) {
                result.append(' ');
            }
        }
        return result.toString();
    }
}
