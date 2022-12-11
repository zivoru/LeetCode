package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/number-of-good-pairs
 * Title: 1512. Number of Good Pairs
 * Difficulty: Easy
 */
public class Problem1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] map = new int[101];
        int res = 0;
        for (int num : nums) {
            res += map[num];
            map[num]++;
        }
        return res;
    }
}
