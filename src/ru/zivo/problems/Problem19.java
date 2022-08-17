package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/remove-nth-node-from-end-of-list
 * Author : Zimin Vladimir
 * Date   : 2022-08-17
 */
public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0, head);
        int size = 0;
        while (dummyHead.next != null) {
            size++;
            dummyHead.next = dummyHead.next.next;
        }
        ListNode curr = dummyHead;
        int position = size - n;
        for (int i = 0; head != null; i++) {
            if (i == position) {
                if (head.next != null) {
                    curr.next = new ListNode(head.next.val);
                    head = head.next.next;
                } else {
                    head = null;
                }
            } else {
                curr.next = new ListNode(head.val);
                head = head.next;
            }
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
