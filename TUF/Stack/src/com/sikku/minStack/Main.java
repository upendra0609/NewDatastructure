package com.sikku.minStack;

public class Main {
    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(1);
        m.push(2);
        System.out.println(m.getMin());
        System.out.println(m.pop());
        System.out.println(m.top());
    }

    static class MinStack {
        static class Node {
            Node next;
            int data;

            public Node(int data) {
                this.data = data;
            }
        }

        private Node head;
        private int min;


        // Constructor
        MinStack() {
            this.min = Integer.MAX_VALUE;
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            Node node = new Node(num);
            if (head != null) {
                node.next = head;
            }
            head = node;
        }

        // Function to remove the top element of the stack.
        int pop() {
            if (head == null) {
                return -1;
            } else {
                int data = head.data;
                head = head.next;
                return data;
            }
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            if (head == null) {
                return -1;
            } else {
                return head.data;
            }
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            min = Integer.MAX_VALUE;
            Node temp = head;
            if (temp == null) {
                return -1;
            }
            while (temp != null) {
                min = Math.min(temp.data, min);
                temp = temp.next;
            }
            return min;
        }
    }
}
