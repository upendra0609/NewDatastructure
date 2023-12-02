package com.sikku.fruitAndBasket;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxFruit(new int[]{10, 8, 25, 3, 23, 3, 3, 28, 2, 24, 7, 2, 22, 12, 18, 16, 1, 16, 6, 1, 6, 20, 10, 3, 2, 0, 25, 5, 14}));
        System.out.println(maxFruit(new int[]{1, 1, 2, 3}));
    }

    public static int maxFruit(int[] arr) {
        int maxFruit = 0;
        int right = 0;
        int left = 0;
        int n = arr.length;
        HashMap<Integer, Integer> hash = new HashMap<>();

        while (right < n) {
            while (right < n && hash.size() <= 2) {
                hash.put(arr[right], hash.getOrDefault(arr[right], 0) + 1);
                right++;
                if (hash.size() <= 2) {
                    int result = 0;
                    Set<Map.Entry<Integer, Integer>> entries = hash.entrySet();
                    for (Map.Entry<Integer, Integer> entry : entries) {
                        result += entry.getValue();
                    }
                    maxFruit = Math.max(maxFruit, result);
                }
            }

            while (left < right && hash.size() > 2) {
                if (hash.containsKey(arr[left]) && hash.get(arr[left]) > 1) {
                    hash.put(arr[left], hash.get(arr[left]) - 1);
                } else {
                    hash.remove(arr[left]);
                }
                left++;
            }
        }
        return maxFruit;
    }
}
