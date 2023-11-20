package com.sikku.queueUsingLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();

        System.out.println(queue.size());
        queue.enqueue(10);

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.size());
    }
}
