package com.sikku;

public class Node<T> {
    T data;
    Node<T> next;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
    }
}
