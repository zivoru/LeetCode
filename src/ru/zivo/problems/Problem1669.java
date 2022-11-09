package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/merge-in-between-linked-lists
 * Title: 1669. Merge In Between Linked Lists
 * Difficulty: Medium
 */
public class Problem1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr2 = list2;
        while (curr2.next != null) {
            curr2 = curr2.next;
        }

        int i = 0;
        ListNode curr1 = list1;
        while (i < a - 1) {
            curr1 = curr1.next;
            i++;
        }

        ListNode curr3 = curr1.next;

        while (i != b) {
            curr3 = curr3.next;
            i++;
        }

        curr2.next = curr3;
        curr1.next = list2;

        return list1;
    }
}
