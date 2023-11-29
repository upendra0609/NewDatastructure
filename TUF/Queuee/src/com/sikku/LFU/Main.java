package com.sikku.LFU;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    private static class Pair implements Comparable<Pair> {
        int key;
        int count;

        public Pair(int key) {
            this.key = key;
            count = 1;
        }

        @Override
        public int compareTo(Pair pair) {
            int count = pair.count;
            if (count > this.count) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
//        TreeMap<Pair, Integer> hash = new TreeMap<>(Pair::compareTo);
//
//        hash.put(new Pair(1), 4);
//        hash.put(new Pair(1), 10);
//        hash.put(new Pair(2), 2);
//        hash.put(new Pair(3), 5);
//        hash.put(new Pair(4), 6);
//
//        Set<Map.Entry<Pair, Integer>> entry = hash.entrySet();
//        for (Map.Entry<Pair, Integer> e : entry) {
//            System.out.println(e.getKey().key + "   " + e.getValue());
//        }

    }
}


