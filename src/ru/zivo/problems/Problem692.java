package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/top-k-frequent-words
 * Title: 692. Top K Frequent Words
 * Difficulty: Medium
 */
public class Problem692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Map<Integer, List<String>> map2 = new TreeMap<>((o1, o2) -> o2 - o1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            List<String> list = map2.getOrDefault(entry.getValue(), new ArrayList<>());
            list.add(entry.getKey());
            map2.put(entry.getValue(), list);
        }

        List<String> result = new ArrayList<>();
        for (List<String> list2 : map2.values()) {
            Collections.sort(list2);
            for (String s : list2) {
                result.add(s);
                if (result.size() == k) break;
            }
            if (result.size() == k) break;
        }

        return result;
    }
}
