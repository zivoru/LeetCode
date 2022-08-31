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
        int curry = 0, sum;
        while (l1 != null && l2 != null) {
            sum = curry + l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;
            curry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        l1 = l1 != null ? l1 : l2;
        while (l1 != null) {
            sum = curry + l1.val;
            l1 = l1.next;
            curry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if (curry == 1) {
            curr.next = new ListNode(curry);
        }
        return dummyHead.next;
    }
}
