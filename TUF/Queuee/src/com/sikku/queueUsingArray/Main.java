package com.sikku.queueUsingArray;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueUsingArray queue = new QueueUsingArray();
        System.out.println(queue.size());
        System.out.println(queue.dequeue());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);

        while (!queue.isEmpty()){
            System.out.print(queue.dequeue()+"  ");
        }
    }
}
