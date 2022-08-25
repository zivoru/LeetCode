package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/roman-to-integer
 * Title: 13. Roman to Integer
 * Difficulty: Easy
 */
public class Problem13 {
    public int romanToInt(String s) {
        int result = 0, value;
        char c, c1;
        for (byte i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            value = switch (c) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            c1 = i + 1 != s.length() ? s.charAt(i + 1) : '!';
            result += ((c == 'I') && (c1 == 'V' || c1 == 'X')) ||
                      ((c == 'X') && (c1 == 'L' || c1 == 'C')) ||
                      ((c == 'C') && (c1 == 'D' || c1 == 'M'))
                    ? -value : value;
        }
        return result;
    }
}
