package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source : https://leetcode.com/problems/longest-substring-without-repeating-characters
 * Author : Zimin Vladimir
 * Date   : 2022-08-15
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!chars.containsKey(s.charAt(i))) {
                chars.put(s.charAt(i), i);
            } else {
                i = chars.get(s.charAt(i));
                if (chars.size() > length) {
                    length = chars.size();
                }
                chars.clear();
            }
        }
        return Math.max(chars.size(), length);
    }
}
