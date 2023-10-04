package com.sikku.problem.noOfSubArrayWithXorK;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 2, 2, 6, 4};
        System.out.println(noOfSubArray(array, 6));
    }

    public static int noOfSubArray(int[] array, int target) {
        int count = 0;

        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);
        int xor = 0;

        for (int i = 0; i < array.length; i++) {
            xor ^= array[i];

            count += hash.getOrDefault(xor ^ target, 0);

            hash.put(xor, hash.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
