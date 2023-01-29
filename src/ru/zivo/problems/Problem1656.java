package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/design-an-ordered-stream
 * Title: 1656. Design an Ordered Stream
 * Difficulty: Easy
 */
public class Problem1656 {
    class OrderedStream {

        String[] arr;
        int curr = 1;

        public OrderedStream(int n) {
            arr = new String[n + 1];
        }

        public List<String> insert(int idKey, String value) {
            List<String> res = new ArrayList<>();
            if (curr == idKey) {
                res.add(value);
                curr++;
                for (int i = idKey + 1; i < arr.length; i++) {
                    if (arr[i] == null) {
                        break;
                    } else {
                        res.add(arr[i]);
                        curr++;
                    }
                }
            } else {
                arr[idKey] = value;
            }
            return res;
        }
    }
}
