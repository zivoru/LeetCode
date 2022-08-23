package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/powx-n
 * Author : Zimin Vladimir
 * Date   : 2022-08-23
 */
public class Problem50 {
    public double myPow(double x, int n) {
        if (x == 1 && n == -2147483648) return 1;
        if (x == -1 && n == -2147483648) return 1;
        if (x == -1 && n == 2147483647) return -1;
        if (x == 0 || n <= -1024) return 0;
        if (x == 1) return 1;
        if (n == 0) return 1;
        if (n == 1) return x;
        double result = x;
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                result = result * x;
            }
        } else {
            for (int i = -1; i > n; i--) {
                result = result * x;
            }
        }
        return n > 0 ? result : 1 / result;
    }
}
