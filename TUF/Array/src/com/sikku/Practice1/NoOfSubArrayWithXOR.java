package com.sikku.Practice1;

import java.util.HashMap;

public class NoOfSubArrayWithXOR {
    public static void main(String[] args) {

    }

    public static int subArray(int[] array, int target) {
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);

        for (int i = 0; i < array.length; i++) {
            xor ^= array[i];
            int x = xor ^ target;
            count += hash.getOrDefault(x, 0);
            hash.put(xor, hash.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
