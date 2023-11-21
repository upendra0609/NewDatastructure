package com.sikku.stackUsingTwoQueue;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.size();
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.size();
    }

}

class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int elem) {
        q2.add(elem);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public int pop() {
        if (q1 != null && q1.peek() != null) {
            return q1.poll();
        }
        return -1;
    }

    public int top() {
        if (q1 != null && q1.peek() != null) {
            return q1.peek();
        }
        return -1;
    }

    public void size() {
        System.out.println(q1.size());
    }

}