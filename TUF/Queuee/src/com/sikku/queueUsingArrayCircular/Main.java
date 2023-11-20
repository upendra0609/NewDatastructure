package com.sikku.queueUsingArrayCircular;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueUsingArray queue = new QueueUsingArray();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        System.out.println(queue.size());

        while (!queue.isEmpty()){
            System.out.print(queue.dequeue()+"  ");
        }
    }
}
