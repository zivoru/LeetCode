package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/power-of-four
 * Author : Zimin Vladimir
 * Date   : 2022-08-22
 */
public class Problem342 {
    public boolean isPowerOfFour(int n) {
        return n == 4096 ||
               n == 64 ||
               n == 256 ||
               n == 1024 ||
               n == 16384 ||
               n == 4194304 ||
               n == 16777216 ||
               n == 67108864 ||
               n == 268435456 ||
               n == 1073741824 ||
               n == 1 ||
               n == 65536 ||
               n == 4 ||
               n == 262144 ||
               n == 16 ||
               n == 1048576;
    }
}
