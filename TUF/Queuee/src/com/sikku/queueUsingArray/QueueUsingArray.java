package com.sikku.queueUsingArray;

public class QueueUsingArray {
    private int[] data;
    private int rear;
    private int front;
    private int size;

    public QueueUsingArray() {
        this(5);
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
        if (rear >= data.length - 1) {
            increaseCapacity();
        }
        rear++;
        data[rear] = elem;
        size++;
        if (front == -1) front++;
    }

    private void increaseCapacity() {
        int[] temp = new int[(int) (size * 2)];
        int index = 0;
        for (int i : data) {
            temp[index++] = i;
        }
        data = temp;
    }

    public int front() throws Exception {
        if (front < 0) {
            throw new Exception("empty queue");
        }
        return data[front];
    }

    public int dequeue() throws Exception {
        if(size==0){
            throw new Exception("Empty Queue");
        }
        int res = data[front];
        for (int i = 0; i <= rear; i++) {
            data[i] = data[i + 1];
        }
        rear--;
        size--;
        return res;
    }

}
