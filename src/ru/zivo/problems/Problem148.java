package ru.zivo.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/sort-list
 * Title: 148. Sort List
 * Difficulty: Medium
 */
public class Problem148 {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode dummyHead = new ListNode(0), curr = dummyHead;
        for (Integer integer : list) {
            curr.next = new ListNode(integer);
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
