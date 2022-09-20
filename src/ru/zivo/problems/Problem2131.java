package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source: https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words
 * Title: 2131. Longest Palindrome by Concatenating Two Letter Words
 * Difficulty: Medium
 */
public class Problem2131 {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb;
        int res = 0, value, rev;
        String key;
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        boolean b = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            value = entry.getValue();
            if (value == 0) continue;
            key = entry.getKey();
            if (key.charAt(0) == key.charAt(1)) {
                if (value % 2 == 0) {
                    res += value * 2;
                } else {
                    if (!b) {
                        res += value * 2;
                        b = true;
                    } else {
                        res += (value - 1) * 2;
                    }
                }
            } else {
                sb = new StringBuilder().append(key.charAt(1)).append(key.charAt(0));
                if (map.containsKey(sb.toString())) {
                    rev = map.get(sb.toString());
                    if (rev != 0) {
                        if (rev == value) {
                            res += rev * 4;
                        } else if (rev > value) {
                            res += (rev - (rev - value)) * 4;
                        } else {
                            res += (value - (value - rev)) * 4;
                        }
                        map.put(sb.toString(), 0);
                    }
                }
            }
        }
        return res;
    }
}
