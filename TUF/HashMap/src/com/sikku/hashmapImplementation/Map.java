package com.sikku.hashmapImplementation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

public class Map<K, V> {
    @RequiredArgsConstructor
    public static class MapNode<K, V> {
        @NonNull
        private K key;
        @NonNull
        private V value;
        private MapNode<K, V> next;
    }

    private int size;
    private int numBucket;
    private ArrayList<MapNode<K, V>> bucket;

    public Map() {
        this.numBucket = 20;
        this.size = 0;
        this.bucket = new ArrayList<>();
        for (int i = 0; i < numBucket; i++) {
            bucket.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % numBucket;
    }

    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        MapNode<K, V> tempHead = head;
        while (tempHead != null) {
            if (tempHead.key.equals(key)) {
                tempHead.value = value;
                return;
            }
            tempHead = tempHead.next;
        }
        MapNode<K, V> newElementNode = new MapNode<>(key, value);
        newElementNode.next = head;
        bucket.set(bucketIndex, newElementNode);
        size++;
    }

    public V getValue(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V removeKey(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        MapNode<K, V> prevNode = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prevNode != null) {
                    prevNode.next = head.next;
                } else {
                    return head.value;
                }
                size--;
            }
            prevNode = head;
            head = head.next;
        }
        return null;
    }

    public int size() {
        return size;
    }
}
