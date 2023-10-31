package com.sikku;

public class LinkedListUse {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        n1.next = n2;
        Node<Integer> n3 = new Node<>(30);
        n2.next = n3;
        Node<Integer> n4 = new Node<>(40);
        n3.next = n4;
        Node<Integer> n5 = new Node<>(50);
        n4.next = n5;
        return n1;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        print(head);
    }
}
