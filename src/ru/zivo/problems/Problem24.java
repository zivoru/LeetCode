package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/swap-nodes-in-pairs
 * Author : Zimin Vladimir
 * Date   : 2022-08-18
 */
public class Problem24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        int prevVal = -1;
        while (head != null) {
            if (head.next != null) {
                if (prevVal == -1) {
                    curr.next = new ListNode(head.next.val);
                    prevVal = head.val;
                } else {
                    curr.next = new ListNode(prevVal);
                    prevVal = -1;
                }
            } else {
                if (prevVal == -1) {
                    curr.next = new ListNode(head.val);
                } else {
                    curr.next = new ListNode(prevVal);
                }
            }

            curr = curr.next;
            head = head.next;
        }
        return dummyHead.next;
    }
}
