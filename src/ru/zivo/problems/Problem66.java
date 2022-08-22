package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/plus-one
 * Author : Zimin Vladimir
 * Date   : 2022-08-22
 */
public class Problem66 {
    public int[] plusOne(int[] digits) {
        int m = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1 || m == 1) {
                int plusOne = digits[i] + 1;
                if (plusOne < 10) {
                    digits[i] = plusOne;
                    return digits;
                } else {
                    digits[i] = plusOne % 10;
                    m = 1;
                }
            }
        }
        if (m == 1) {
            int[] ints = new int[digits.length + 1];
            ints[0] = 1;
            System.arraycopy(digits, 0, ints, 1, digits.length);
            return ints;
        }
        return digits;
    }
}
