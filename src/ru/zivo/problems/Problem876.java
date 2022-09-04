package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/middle-of-the-linked-list
 * Title: 876. Middle of the Linked List
 * Difficulty: Easy
 */
public class Problem876 {
    public ListNode middleNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        ListNode dummyHead = new ListNode(1);
        ListNode curr = dummyHead;
        for (int i = list.size() / 2; i < list.size(); i++) {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
