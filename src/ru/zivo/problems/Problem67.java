package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/add-binary
 * Title: 67. Add Binary
 * Difficulty: Easy
 */
public class Problem67 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ai = a.length() - 1, bi = b.length() - 1, r = 0;
        while (ai >= 0 || bi >= 0 || r == 1) {
            char ac = ai >= 0 ? a.charAt(ai--) : '0', bc = bi >= 0 ? b.charAt(bi--) : '0';
            int sum = (ac == '1' ? 1 : 0) + (bc == '1' ? 1 : 0) + r;
            res.append(sum == 0 || sum == 2 ? 0 : 1);
            if (sum == 1) r = 0;
            if (sum == 2) r = 1;
        }
        return res.reverse().toString();
    }
}
