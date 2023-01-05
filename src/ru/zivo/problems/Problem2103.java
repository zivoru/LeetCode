package ru.zivo.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/rings-and-rods
 * Title: 2103. Rings and Rods
 * Difficulty: Easy
 */
public class Problem2103 {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < rings.length() - 1; i += 2) {
            Set<Character> set = map.getOrDefault(rings.charAt(i + 1), new HashSet<>());
            set.add(rings.charAt(i));
            map.put(rings.charAt(i + 1), set);
        }
        int count = 0;
        for (Set<Character> value : map.values()) {
            if (value.size() == 3) {
                count++;
            }
        }
        return count;
    }
}
