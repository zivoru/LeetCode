package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/power-of-four
 * Title: 342. Power of Four
 * Difficulty: Easy
 */
public class Problem342 {
    public boolean isPowerOfFour(int n) {
        return n == 1 ||
               n == 4 ||
               n == 16 ||
               n == 64 ||
               n == 256 ||
               n == 1024 ||
               n == 4096 ||
               n == 16384 ||
               n == 65536 ||
               n == 262144 ||
               n == 1048576 ||
               n == 4194304 ||
               n == 16777216 ||
               n == 67108864 ||
               n == 268435456 ||
               n == 1073741824;
    }
}
