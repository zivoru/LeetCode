package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/reverse-nodes-in-k-group
 * Title: 25. Reverse Nodes in k-Group
 * Difficulty: Hard
 */
public class Problem25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int bias = k - 1;
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (bias >= list.size()) {
                ints[i] = list.get(i);
            } else {
                ints[i] = list.get(bias--);
                if (bias == i - k) bias = i + k;
            }
        }

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        for (int anInt : ints) {
            curr.next = new ListNode(anInt);
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
