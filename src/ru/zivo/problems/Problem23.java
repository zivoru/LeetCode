package ru.zivo.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/merge-k-sorted-lists
 * Title: 23. Merge k Sorted Lists
 * Difficulty: Hard
 */
public class Problem23 {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> integers = new ArrayList<>();
        for (ListNode listNode : lists) {
            while (listNode != null) {
                integers.add(listNode.val);
                listNode = listNode.next;
            }
        }
        Collections.sort(integers);

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        for (Integer integer : integers) {
            curr.next = new ListNode(integer);
            curr = curr.next;
        }

        return dummyHead.next;
    }
}
