package ru.zivo.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Source: https://leetcode.com/problems/reverse-linked-list
 * Title: 210. Course Schedule II
 * Difficulty: Medium
 */
public class Problem210 {
    public int[] findOrder(int n, int[][] p) {
        List<List<Integer>> nm = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nm.add(new ArrayList<>());
        }
        for (int[] ints : p) {
            nm.get(ints[1]).add(ints[0]);
        }
        Queue<Integer> kk = new LinkedList<>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            for (int k : nm.get(i)) {
                a[k]++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                kk.offer(i);
            }
        }
        int[] k = new int[n];
        int i = 0;
        while (!kk.isEmpty()) {
            int x = kk.poll();
            k[i++] = x;
            for (int j : nm.get(x)) {
                a[j]--;
                if (a[j] == 0) {
                    kk.offer(j);
                }
            }
        }
        return i == n ? k : new int[0];
    }
}
