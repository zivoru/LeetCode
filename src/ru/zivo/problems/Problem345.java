package ru.zivo.problems;

import java.util.Set;

/**
 * Source: https://leetcode.com/problems/reverse-vowels-of-a-string
 * Title: 345. Reverse Vowels of a String
 * Difficulty: Easy
 */
public class Problem345 {
    public String reverseVowels(String s) {
        char[] chars = new char[s.length()];
        Set<Character> characters = Set.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        int k = 0;
        for (char c : s.toCharArray()) {
            chars[k++] = c;
        }
        for (int i = 0, j = s.length() - 1; i < j;) {
            char ci = chars[i];
            char cj = chars[j];
            if (!characters.contains(ci)) {
                i++;
            }
            if (!characters.contains(cj)) {
                j--;
            }
            if (characters.contains(ci) && characters.contains(cj)) {
                chars[i++] = cj;
                chars[j--] = ci;
            }
        }
        return String.valueOf(chars);
    }
}
