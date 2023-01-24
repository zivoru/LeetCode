package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/determine-if-string-halves-are-alike
 * Title: 1704. Determine if String Halves Are Alike
 * Difficulty: Easy
 */
public class Problem1704 {
    public boolean halvesAreAlike(String s) {
        String s1 = s.toLowerCase();
        int medium = s.length() / 2;
        return getChars(s1, 0, medium) == getChars(s1, medium, s1.length());
    }

    private static int getChars(String s, int start, int finish) {
        int count = 0;
        for (int i = start; i < finish; i++) {
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                count++;
            }
        }
        return count;
    }
}
