package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/longest-palindrome
 * Title: 409. Longest Palindrome
 * Difficulty: Easy
 */
public class Problem409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        if (map.size() == 1) {
            for (Integer value : map.values()) {
                return value;
            }
        }

        int max = 0;
        boolean center = false;
        for (Integer i : map.values() ) {
            max += i % 2 == 0 ? i : i - 1;
            if (i % 2 != 0) center = true;
        }

        return center ? max + 1 : max;
    }
}
