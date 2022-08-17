package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source : https://leetcode.com/problems/merge-k-sorted-lists
 * Author : Zimin Vladimir
 * Date   : 2022-08-16
 */
public class Problem23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for (ListNode listNode : lists) {
            while (listNode != null) {
                list.add(listNode.val);
                listNode = listNode.next;
            }
        }

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        List<Integer> integers = list.stream().sorted().toList();
        for (Integer integer : integers) {
            curr.next = new ListNode(integer);
            curr = curr.next;
        }

        return dummyHead.next;
    }
}
