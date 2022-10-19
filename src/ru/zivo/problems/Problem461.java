package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/hamming-distance
 * Title: 461. Hamming Distance
 * Difficulty: Easy
 */
public class Problem461 {
    public static int hammingDistance(int x, int y) {
        String sX = Integer.toBinaryString(x), sY = Integer.toBinaryString(y);
        int res = 0, iX = sX.length() - 1, iY = sY.length() - 1;

        while (iX >= 0 || iY >= 0) {
            if (iX >= 0 && iY >= 0) {
                if (sX.charAt(iX--) != sY.charAt(iY--)) {
                    res++;
                }
            } else if (iX >= 0) {
                if (sX.charAt(iX--) == '1') {
                    res++;
                }
            } else {
                if (sY.charAt(iY--) == '1') {
                    res++;
                }
            }
        }

        return res;
    }
}
