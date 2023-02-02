package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/zigzag-conversion
 * Title: 6. Zigzag Conversion
 * Difficulty: Medium
 */
public class Problem6 {
    public String convert(String s, int numRows) {
        int dist = numRows == 1 ? 1 : numRows + (numRows - 2);
        StringBuilder sb = new StringBuilder();
        for (int row = 0, distance = 0; row < numRows; row++, distance += 2) {
            for (int i = row; i < s.length(); i += dist) {
                sb.append(s.charAt(i));
                if (row != 0 && row != numRows - 1 && distance < dist && i + (dist - distance) < s.length()) {
                    sb.append(s.charAt(i + (dist - distance)));
                }
            }
        }
        return sb.toString();
    }
}
