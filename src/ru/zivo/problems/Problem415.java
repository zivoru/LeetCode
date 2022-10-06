package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/add-strings
 * Title: 415. Add Strings
 * Difficulty: Easy
 */
public class Problem415 {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int mod = 0, l1 = num1.length() - 1, l2 = num2.length() - 1;
        while (l1 >= 0 || l2 >= 0 || mod > 0) {
            int sum = mod;
            if (l1 >= 0) {
                sum += Character.getNumericValue(num1.charAt(l1--));
            }
            if (l2 >= 0) {
                sum += Character.getNumericValue(num2.charAt(l2--));
            }
            res.append(sum % 10);
            mod = sum / 10;
        }
        return res.reverse().toString();
    }
}
