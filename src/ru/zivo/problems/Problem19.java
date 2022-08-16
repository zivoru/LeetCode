package ru.zivo.problems;

import java.util.LinkedList;

/**
 * Source : https://leetcode.com/problems/remove-nth-node-from-end-of-list
 * Author : Zimin Vladimir
 * Date   : 2022-08-17
 */
public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        LinkedList<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        list.remove(list.size() - n);
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        for (Integer integer : list) {
            curr.next = new ListNode(integer);
            curr = curr.next;
        }
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
