package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/min-cost-climbing-stairs
 * Title: 746. Min Cost Climbing Stairs
 * Difficulty: Easy
 */
public class Problem746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] mc = new int[n + 1];
        mc[0] = 0;
        mc[1] = 0;
        for (int i = 2; i <= n; i++) {
            mc[i] = Math.min(mc[i - 2] + cost[i - 2], mc[i - 1] + cost[i - 1]);
        }
        return mc[n];
    }
}
