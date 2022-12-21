package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/sorting-the-sentence
 * Title: 1859. Sorting the Sentence
 * Difficulty: Easy
 */
public class Problem1859 {
    public String sortSentence(String s) {
        Map<Integer, String> map = new TreeMap<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                start = i + 1;
            } else if (s.charAt(i) > 48 && s.charAt(i) < 58) {
                map.put(Character.getNumericValue(s.charAt(i)), s.substring(start, i));
            }
        }
        var res = new StringBuilder();
        for (String value : map.values()) {
            res.append(value);
            res.append(' ');
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
