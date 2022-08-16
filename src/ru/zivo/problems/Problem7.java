package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/reverse-integer
 * Author : Zimin Vladimir
 * Date   : 2022-07-23
 */
public class Problem7 {
    public int reverse(int x) {
        long reversed = 0;
        for (int i = x; i != 0; i /= 10) {
            reversed = (i % 10) + (reversed * 10);
        }
        return reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE ? 0 : (int) reversed;
    }
}
