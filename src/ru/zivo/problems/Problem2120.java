package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid
 * Title: 2120. Execution of All Suffix Instructions Staying in a Grid
 * Difficulty: Medium
 */
public class Problem2120 {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int number = -1;
            step(number, res, i, n, startPos, s.substring(i));
        }
        return res;
    }

    private void step(int number, int[] res, int i, int n, int[] startPos, String substring) {
        if (startPos[0] >= n || startPos[0] < 0 || startPos[1] >= n || startPos[1] < 0) {
            res[i] = number;
        } else if (number == substring.length() - 1) {
            res[i] = number + 1;
        } else {
            char c = substring.charAt(++number);
            if (c == 'R') {
                step(number, res, i, n, new int[]{startPos[0], startPos[1] + 1}, substring);
            } else if (c == 'D') {
                step(number, res, i, n, new int[]{startPos[0] + 1, startPos[1]}, substring);
            } else if (c == 'L') {
                step(number, res, i, n, new int[]{startPos[0], startPos[1] - 1}, substring);
            } else {
                step(number, res, i, n, new int[]{startPos[0] - 1, startPos[1]}, substring);
            }
        }
    }
}
