package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/word-pattern
 * Title: 290. Word Pattern
 * Difficulty: Easy
 */
public class Problem290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        int i = 0, j = 0,  pl = pattern.length(), sl = s.length();
        for (; i < pl && j < sl; i++, j++) {
            int start = j;
            while (j < sl && s.charAt(j) != ' ') {
                j++;
            }
            if (map.containsKey(pattern.charAt(i))) {
                if (!s.substring(start, j).equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                if (map.containsValue(s.substring(start, j))) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), s.substring(start, j));
                }
            }
        }
        return i >= pl && j >= sl;
    }
}
