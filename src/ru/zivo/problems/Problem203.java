package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/remove-linked-list-elements
 * Title: 203. Remove Linked List Elements
 * Difficulty: Easy
 */
public class Problem203 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr = new ListNode(0, head);

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
