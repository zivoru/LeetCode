package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/implement-queue-using-stacks
 * Title: 232. Implement Queue using Stacks
 * Difficulty: Easy
 */
public class Problem232 {
    class MyQueue {
        List<Integer> list = new ArrayList<>();

        public MyQueue() {

        }

        public void push(int x) {
            list.add(x);
        }

        public int pop() {
            return list.remove(0);
        }

        public int peek() {
            return list.get(0);
        }

        public boolean empty() {
            return list.isEmpty();
        }
    }
}
