package ru.zivo.problems;

import java.util.List;

/**
 * Source: https://leetcode.com/problems/count-items-matching-a-rule
 * Title: 1773. Count Items Matching a Rule
 * Difficulty: Easy
 */
public class Problem1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = switch (ruleKey.charAt(0)) {
            case 'c' -> 1;
            case 'n' -> 2;
            default -> 0;
        };
        int res = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }
}
