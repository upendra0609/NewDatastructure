package com.sikku.Demo;

import java.lang.annotation.Target;

public class StackUsingLinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;

    public void push(T t) {
        if (head == null) {
            head = new Node<>(t);
            last = head;
        } else {
            last.next = new Node<>(t);
            last = last.next;
        }
        size++;
    }

    public T top() throws Exception {
        if (last == null) {
            throw new Exception("Empty Stack");
        }
        return head.data;
    }

    public T pop() throws Exception {
        if (last == null) {
            throw new Exception("Empty Stack");
        }
        T ans = last.data;
        if (head == last) {
            head = null;
            last = null;
            return ans;
        }

        Node<T> temp = head;
        while (temp != null && temp.next != last) {
            temp = temp.next;
        }
        size--;
        last = temp;
        return ans;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }
}
