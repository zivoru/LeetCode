package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to
 * Title: 1282. Group the People Given the Group Size They Belong To
 * Difficulty: Medium
 */
public class Problem1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List[] lists = new List[500];
        List<List<Integer>> res = new ArrayList<>();

        int i = 0;
        for (int groupSize : groupSizes) {
            List<Integer> list = lists[groupSize] == null ? new ArrayList<>() : lists[groupSize];
            list.add(i++);
            if (list.size() == groupSize) {
                res.add(list);
                list = new ArrayList<>();
            }
            lists[groupSize] = list;
        }

        return res;
    }
}
