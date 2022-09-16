package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/where-will-the-ball-fall
 * Title: 1706. Where Will the Ball Fall
 * Difficulty: Medium
 */
public class Problem1706 {
    public int[] findBall(int[][] grid) {
        int l = grid[0].length, dummy;
        int[] res = new int[l];
        for (int i = 0; i < l; i++) {
            dummy = i;
            for (int[] ints : grid) {
                if (dummy < 0 || dummy >= l) {
                    dummy = -1;
                    break;
                }
                if (ints[dummy] == 1) {
                    if (dummy + 1 < l && ints[dummy + 1] == -1) {
                        dummy = -1;
                        break;
                    } else {
                        dummy++;
                    }
                } else {
                    if (dummy - 1 >= 0 && ints[dummy - 1] == 1) {
                        dummy = -1;
                        break;
                    } else {
                        dummy--;
                    }
                }
            }
            res[i] = (dummy < 0 || dummy >= l) ? -1 : dummy;
        }
        return res;
    }
}
