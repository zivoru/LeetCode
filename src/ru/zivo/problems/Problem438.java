package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/find-all-anagrams-in-a-string
 * Title: 438. Find All Anagrams in a String
 * Difficulty: Medium
 */
public class Problem438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length())
            return list;

        int[] cur = new int[26], pp = new int[26];
        int x = s.length(), y = p.length();

        for (int i = 0; i < y; i++) {
            cur[s.charAt(i) - 'a']++;
            pp[p.charAt(i) - 'a']++;
        }

        for (int j = y; j < x; j++) {
            if (Arrays.equals(cur, pp)) {
                list.add(j - y);
            }
            cur[s.charAt(j - y) - 'a']--;
            cur[s.charAt(j) - 'a']++;
        }

        if (Arrays.equals(pp, cur)) {
            list.add(x - y);
        }
        return list;
    }
}
