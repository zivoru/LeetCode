package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/reverse-words-in-a-string-iii
 * Title: 557. Reverse Words in a String III
 * Difficulty: Easy
 */
public class Problem557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        var res = new StringBuilder();
        for (String s1 : arr) {
            res.append(new StringBuilder(s1).reverse());
            res.append(' ');
        }
        res.setLength(res.length() - 1);
        return res.toString();
    }
}
