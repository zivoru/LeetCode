package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/decode-string
 * Title: 394. Decode String
 * Difficulty: Medium
 */
public class Problem394 {
    public int j = 0;

    public String decodeString(String s) {
        j = 0;
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                j = i + 1;
                result.append(getText(s, count));
                count = 0;
                i = j - 1;
            } else if (s.charAt(i) == '0'
                       || s.charAt(i) == '1'
                       || s.charAt(i) == '2'
                       || s.charAt(i) == '3'
                       || s.charAt(i) == '4'
                       || s.charAt(i) == '5'
                       || s.charAt(i) == '6'
                       || s.charAt(i) == '7'
                       || s.charAt(i) == '8'
                       || s.charAt(i) == '9') {
                count = count * 10 + Character.getNumericValue(s.charAt(i));
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public String getText(String s, int count) {
        StringBuilder sb = new StringBuilder();
        int count2 = 0;
        for (int i = j; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                j = i + 1;
                sb.append(getText(s, count2));
                count2 = 0;
                i = j - 1;
            } else if (s.charAt(i) == ']') {
                j = i + 1;
                break;
            } else if (s.charAt(i) == '0'
                       || s.charAt(i) == '1'
                       || s.charAt(i) == '2'
                       || s.charAt(i) == '3'
                       || s.charAt(i) == '4'
                       || s.charAt(i) == '5'
                       || s.charAt(i) == '6'
                       || s.charAt(i) == '7'
                       || s.charAt(i) == '8'
                       || s.charAt(i) == '9') {
                count2 = count2 * 10 + Character.getNumericValue(s.charAt(i));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return String.valueOf(sb).repeat(Math.max(0, count));
    }
}
