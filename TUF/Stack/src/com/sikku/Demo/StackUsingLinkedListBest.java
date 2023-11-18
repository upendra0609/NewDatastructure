package com.sikku.Demo;

public class StackUsingLinkedListBest<T> {
    private Node<T> head;
    private int size;


    //TC O(1)
    public void push(T t) {
        Node<T> temp = new Node<>(t);
        temp.next = head;
        head = temp;
        size++;
    }

    //TC O(1)
    public T top() throws Exception {
        if (head == null) {
            throw new Exception("Empty Stack");
        }
        return head.data;
    }

    //TC O(1)
    public T pop() throws Exception {
        if (head == null) {
            throw new Exception("Empty Stack");
        }
        T ans = head.data;
        head = head.next;
        size--;
        return ans;
    }

    //TC O(1)
    public boolean isEmpty() {
        return size == 0;
    }

    //TC O(1)
    public int size() {
        return size;
    }
}
