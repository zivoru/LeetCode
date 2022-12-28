package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer
 * Title: 1290. Convert Binary Number in a Linked List to Integer
 * Difficulty: Easy
 */
public class Problem1290 {
    public int getDecimalValue(ListNode head) {
        var binary = new StringBuilder();
        while (head != null) {
            binary.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(binary.toString(), 2);
    }
}
