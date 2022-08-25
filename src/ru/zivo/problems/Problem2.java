package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/add-two-numbers
 * Title: 2. Add Two Numbers
 * Difficulty: Medium
 */
public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        boolean ten = false;
        while (l1 != null || l2 != null || ten) {
            int sum = ten ? 1 : 0;
            ten = false;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum >= 10) {
                ten = true;
            }
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
