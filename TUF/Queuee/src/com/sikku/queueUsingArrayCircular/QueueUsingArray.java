package com.sikku.queueUsingArrayCircular;

public class QueueUsingArray {
    private int[] data;
    private int rear;
    private int front;
    private int size;

    public QueueUsingArray() {
        this(3);
    }

    public QueueUsingArray(int size) {
        data = new int[size];
        this.rear = -1;
        this.front = -1;
    }

    public int size() throws Exception {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public void enqueue(int elem) {
        if (size == data.length) {
            increaseCapacity();
        }
        rear = (rear + 1) % data.length;
        data[rear] = elem;
        size++;
        if (front == -1) {
            front++;
        }
    }

    private void increaseCapacity() {
        int[] temp = new int[size * 2];

        int index = 0;
        for (int i = front; i < data.length; i++) {
            temp[index++] = data[i];
        }

        for (int i = 0; i <= front - 1; i++) {
            temp[index++] = data[i];
        }
        front = 0;
        rear = data.length - 1;
        data = temp;
    }

    public int dequeue() throws Exception {
        if (size <= 0) {
            throw new Exception("Empty Queue");
        }

        int ans = data[front];
        front = (front + 1) % data.length;
        size--;
        if (size == 0) {
            rear = -1;
            front = -1;
        }
        return ans;
    }

    public int front() throws Exception {
        if (front < 0) {
            throw new Exception("empty queue");
        }
        return data[front];
    }

}
