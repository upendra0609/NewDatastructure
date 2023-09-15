package com.sikku;

import java.util.*;

public class UsingHashMap {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 1, 4, 1, 5, 23, 133, 4, 1, 4, 4};

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i : array) {
            if (hash.containsKey(i)) {
                hash.put(i, hash.get(i) + 1);
            } else {
                hash.put(i, 1);
            }
        }
    }
}
