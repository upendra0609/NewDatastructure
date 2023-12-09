package com.sikku.hashmapImplementation;

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
        double loadFactor = (1.0 * size) / numBucket;
        if (loadFactor > 0.7) {
            rehash();
        }
    }

    private void rehash() {
        System.out.println("Rehashing bucket " + numBucket + " size " + size());
        ArrayList<MapNode<K, V>> temp = bucket;
        this.bucket = new ArrayList<>();
        for (int i = 0; i < numBucket * 2; i++) {
            bucket.add(null);
        }
        size = 0;
        numBucket *= 2;
        for (var head : temp) {
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
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
                    bucket.set(bucketIndex, head.next);
                }
                size--;
                return head.value;
            }
            prevNode = head;
            head = head.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public double loadFactor() {
        return (1.0 * size) / numBucket;
    }
}
