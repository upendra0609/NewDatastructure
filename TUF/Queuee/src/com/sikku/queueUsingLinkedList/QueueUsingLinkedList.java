package com.sikku.queueUsingLinkedList;

public class QueueUsingLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    private int size;

    public QueueUsingLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public void enqueue(T elem) {
        Node<T> node = new Node<>(elem);

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }


    public T dequeue() throws Exception {
        if (head == null) {
            throw new Exception("Empty Queue");
        }
        T item = head.getData();
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
        return item;
    }

    public T front() throws Exception {
        if (head == null) {
            throw new Exception("Empty Queue");
        }
        return head.getData();
    }

}
