package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/linked-list-cycle
 * Title: 141. Linked List Cycle
 * Difficulty: Easy
 */
public class Problem141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head.next)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
