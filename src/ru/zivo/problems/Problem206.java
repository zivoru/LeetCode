package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/reverse-linked-list
 * Title: 206. Reverse Linked List
 * Difficulty: Easy
 */
public class Problem206 {
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        for (int i = list.size() - 1; i >= 0; i--) {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
