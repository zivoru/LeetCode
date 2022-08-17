package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source : https://leetcode.com/problems/first-unique-character-in-a-string
 * Author : Zimin Vladimir
 * Date   : 2022-08-17
 */
public class Problem387 {
    public int firstUniqChar(String s) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean d = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j) || chars.contains(c)) {
                    d = false;
                    chars.add(c);
                    break;
                }
            }
            if (d && !chars.contains(c)) return i;
        }
        return -1;
    }
}
