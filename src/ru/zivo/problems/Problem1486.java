package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/xor-operation-in-an-array
 * Title: 1486. XOR Operation in an Array
 * Difficulty: Easy
 */
public class Problem1486 {
    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= start + 2 * i;
        }
        return res;
    }
}
