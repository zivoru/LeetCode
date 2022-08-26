package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/trapping-rain-water
 * Title: 42. Trapping Rain Water
 * Difficulty: Hard
 */
public class Problem42 {
    public int trap(int[] height) {
        int sum = 0;
        for (int start = 0; start < height.length; start++) {
            int s = 0;
            int max = start + 1;
            boolean add = false;
            for (int i = start + 1; i < height.length; i++) {
                if (height[i] < height[start]) {
                    s += height[start] - height[i];
                    if (height[i] > height[max]) {
                        max = i;
                    }
                } else {
                    sum += s;
                    add = true;
                    start = i - 1;
                    break;
                }
            }
            if (!add) {
                for (int k = start + 1; k < max; k++) {
                    sum += height[max] - height[k];
                }
                start = max - 1;
            }
        }
        return sum;
    }
}
