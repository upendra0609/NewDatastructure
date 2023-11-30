package com.sikku.LRU.lru1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        ["LRUCache","put","put","put","put","get","get","get","get","put","get","get","get","get","get"]
//        [[3],[1,1],[2,2],[3,3],[4,4],[4],[3],[2],[1],[5,5],[1],[2],[3],[4],[5]]
        LRUCache cache = new LRUCache(3);
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        cache.put(4,4);
        System.out.println(cache.get(4));
        System.out.println(cache.get(3));
        System.out.println(cache.get(2));
        System.out.println(cache.get(1));
        cache.put(5,5);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
        System.out.println(cache.get(5));
    }
}



class LRUCache {
    private class Node{
        int key, value;
        Node prev, next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }

    }
    private int capacity;
    private Node head;
    private Node tail;
    HashMap<Integer,Node> hash;
    private int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        hash = new HashMap<>();
    }

    public int get(int key) {
        Node tempNode;
        if(hash.containsKey(key)){
            int value = hash.get(key).value;
            tempNode = hash.get(key);
            tempNode.prev.next = tempNode.next;
            tempNode.next.prev = tempNode.prev;
            tempNode.next = head.next;
            head.next.prev = tempNode;
            head.next = tempNode;
            tempNode.prev = head;
            return value;
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        Node tempNode;
        if(hash.containsKey(key)){
            tempNode = hash.get(key);
            tempNode.value = value;
            tempNode.prev.next = tempNode.next;
            tempNode.next.prev = tempNode.prev;
            tempNode.next = head.next;
            head.next.prev = tempNode;
            head.next = tempNode;
            tempNode.prev = head;
        }else if(size == capacity){
            Node deleteNode = tail.prev;
            deleteNode.prev.next = tail;
            tail.prev = deleteNode.prev;
            hash.remove(deleteNode.key);
            tempNode = new Node(key,value);
            tempNode.next = head.next;
            head.next.prev = tempNode;
            head.next = tempNode;
            tempNode.prev = head;
            hash.put(key,tempNode);
        }else{
            tempNode = new Node(key,value);
            tempNode.next = head.next;
            head.next.prev = tempNode;
            head.next = tempNode;
            tempNode.prev = head;
            hash.put(key,tempNode);
            size++;
        }
    }
}