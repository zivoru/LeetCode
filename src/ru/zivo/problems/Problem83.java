package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/remove-duplicates-from-sorted-list
 * Title: 83. Remove Duplicates from Sorted List
 * Difficulty: Easy
 */
public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> values = new HashSet<>();
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while (head != null) {
            if (!values.contains(head.val)) {
                curr.next = new ListNode(head.val);
                curr = curr.next;
                values.add(head.val);
            }
            head = head.next;
        }
        return dummyHead.next;
    }
}
