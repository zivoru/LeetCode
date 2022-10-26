package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/merge-nodes-in-between-zeros
 * Title: 2181. Merge Nodes in Between Zeros
 * Difficulty: Medium
 */
public class Problem2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int sum = 0;
        head = head.next;

        while (head != null) {
            if (head.val == 0) {
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            } else {
                sum += head.val;
            }
            head = head.next;
        }

        return dummyHead.next;
    }
}
