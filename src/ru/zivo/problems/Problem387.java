package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source : https://leetcode.com/problems/first-unique-character-in-a-string
 * Author : Zimin Vladimir
 * Date   : 2022-08-17
 */
public class Problem387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean d = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j) || map.containsKey(c)) {
                    d = false;
                    map.put(c, 0);
                    break;
                }
            }
            if (d && !map.containsKey(c)) return i;
        }
        return -1;
    }
}
