package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Source: https://leetcode.com/problems/isomorphic-strings
 * Title: 205. Isomorphic Strings
 * Difficulty: Easy
 */
public class Problem205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>(), map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!Objects.equals(map2.putIfAbsent(t.charAt(i), i), map.putIfAbsent(s.charAt(i), i))) {
                return false;
            }
        }
        return true;
    }
}
