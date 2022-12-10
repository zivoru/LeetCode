package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/jewels-and-stones
 * Title: 771. Jewels and Stones
 * Difficulty: Easy
 */
public class Problem771 {
    public int numJewelsInStones(String jewels, String stones) {
        int[] map = new int[58];
        for (char c : jewels.toCharArray()) {
            map[c - 'A']++;
        }
        int res = 0;
        for (char c : stones.toCharArray()) {
            if (map[c - 'A'] > 0) {
                res++;
            }
        }
        return res;
    }
}
