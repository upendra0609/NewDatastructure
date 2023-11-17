package com.sikku.problem.longestSubArrayWithZeroSum;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        int[] array = {0, 10, 23};
        int n = longestSubArray(array);
        System.out.println(n);
    }

    public static int longestSubArray(int[] array) {
        int length = 0;
        int sum = 0;

        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, -1);

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (hash.containsKey(sum)) {
                int len = i - hash.get(sum);
                if (len > length) {
                    length = len;
                }
            } else {
                hash.put(sum, i);
            }
        }

        return length;
    }
}
