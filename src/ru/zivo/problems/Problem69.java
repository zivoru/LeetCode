package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/sqrtx
 * Author : Zimin Vladimir
 * Date   : 2022-08-22
 */
public class Problem69 {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        for (int i = 2; i < x; i++) {
            if (i * i == 0) return 46340;
            if (i * i == x) return i;
            if (i * i > x) return i - 1;
        }
        return 1;
    }
}
