package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/intersection-of-two-linked-lists
 * Title: 160. Intersection of Two Linked Lists
 * Difficulty: Easy
 */
public class Problem160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> listA = new ArrayList<>();
        List<ListNode> listB = new ArrayList<>();
        while (headA != null || headB != null) {
            if (headA != null) {
                listA.add(headA);
                headA = headA.next;
            }
            if (headB != null) {
                listB.add(headB);
                headB = headB.next;
            }
        }
        ListNode result = null;
        if (listA.size() == 1 || listB.size() == 1) {
            if (listA.get(listA.size() - 1) == listB.get(listB.size() - 1)) {
                result = listA.get(listA.size() - 1);
            }
        } else {
            for (int i = listA.size() - 1, j = listB.size() - 1; i >= 0 && j >= 0; i--, j--) {
                if (i != 0 && j != 0) {
                    if (listA.get(i) == listB.get(j) && listA.get(i - 1) != listB.get(j - 1)) {
                        result = listA.get(i);
                        break;
                    }
                } else {
                    if (listA.get(i) == listB.get(j)) {
                        result = listA.get(i);
                    }
                }
            }
        }
        return result;
    }
}
