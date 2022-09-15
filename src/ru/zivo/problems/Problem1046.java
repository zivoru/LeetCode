package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/last-stone-weight
 * Title: 1046. Last Stone Weight
 * Difficulty: Easy
 */
public class Problem1046 {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> list = new ArrayList<>();
        for (int value : stones) list.add(value);

        for (int i = list.size() - 1; i > 0; i--) {
            if (Objects.equals(list.get(i), list.get(i - 1))) {
                list.remove(i);
                list.remove(i - 1);
                i--;
            } else if (list.get(i) > list.get(i - 1)) {
                list.set(i, list.get(i) - list.get(i - 1));
                list.remove(i - 1);
                Collections.sort(list);
            } else {
                list.set(i - 1, list.get(i - 1) - list.get(i));
                list.remove(i);
                Collections.sort(list);
            }
        }

        return list.isEmpty() ? 0 : list.get(0);
    }
}
