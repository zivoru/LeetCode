package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/linked-list-cycle-ii
 * Title: 142. Linked List Cycle II
 * Difficulty: Medium
 */
public class Problem142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode curr = new ListNode(0, head);
        while (curr != null) {
            if (set.contains(curr.next)) {
                return curr.next;
            } else {
                set.add(curr);
                curr = curr.next;
            }
        }
        return null;
    }
}
