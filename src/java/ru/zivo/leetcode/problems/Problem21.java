package java.ru.zivo.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source : https://leetcode.com/problems/median-of-two-sorted-arrays
 * Author : Zimin Vladimir
 * Date   : 2022-08-15
 */
public class Problem21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();
        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
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
