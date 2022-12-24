package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/check-if-the-sentence-is-pangram
 * Title: 1832. Check if the Sentence Is Pangram
 * Difficulty: Easy
 */
public class Problem1832 {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (set.size() == 26) {
                return true;
            } else {
                set.add(c);
            }
        }
        return set.size() == 26;
    }
}
