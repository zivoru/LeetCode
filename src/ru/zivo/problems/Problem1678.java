package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/goal-parser-interpretation
 * Title: 1678. Goal Parser Interpretation
 * Difficulty: Easy
 */
public class Problem1678 {
    public String interpret(String command) {
        var res = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                res.append('G');
            } else {
                if (command.charAt(i + 1) == ')') {
                    res.append('o');
                    i++;
                } else {
                    res.append("al");
                    i += 3;
                }
            }
        }

        return res.toString();
    }
}
