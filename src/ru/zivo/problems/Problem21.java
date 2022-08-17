package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/merge-two-sorted-lists
 * Author : Zimin Vladimir
 * Date   : 2022-08-15
 */
public class Problem21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    curr.next = new ListNode(list1.val);
                    curr = curr.next;
                    list1 = list1.next;
                } else {
                    curr.next = new ListNode(list2.val);
                    curr = curr.next;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                curr.next = new ListNode(list1.val);
                curr = curr.next;
                list1 = list1.next;
            } else {
                curr.next = new ListNode(list2.val);
                curr = curr.next;
                list2 = list2.next;
            }
        }

        return dummyHead.next;
    }
}
