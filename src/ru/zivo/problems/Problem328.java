package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/odd-even-linked-list
 * Title: 328. Odd Even Linked List
 * Difficulty: Medium
 */
public class Problem328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0), currOdd = odd;
        ListNode even = new ListNode(0), currEven = even;
        boolean parity = false;
        while (head != null) {
            if (!parity) {
                currOdd.next = new ListNode(head.val);
                currOdd = currOdd.next;
            } else {
                currEven.next = new ListNode(head.val);
                currEven = currEven.next;
            }
            head = head.next;
            parity = !parity;
        }
        currOdd.next = even.next;
        return odd.next;
    }
}
