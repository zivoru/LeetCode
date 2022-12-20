package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/decode-the-message
 * Title: 2325. Decode the Message
 * Difficulty: Easy
 */
public class Problem2325 {
    public String decodeMessage(String key, String message) {
        char[] letters = new char[26];
        char abc = 'a';
        for (char c : key.toCharArray()) {
            if (c != ' ' && letters[c - 'a'] == '\u0000') {
                letters[c - 'a'] = abc++;
            }
            if (abc == '{') {
                break;
            }
        }

        var res = new StringBuilder();
        for (char c : message.toCharArray()) {
            res.append(c == ' ' ? ' ' : letters[c - 'a']);
        }
        return res.toString();
    }
}
