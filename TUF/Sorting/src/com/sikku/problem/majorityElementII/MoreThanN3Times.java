package com.sikku.problem.majorityElementII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoreThanN3Times {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 3, 3, 2, 2, 2};
//        Set<Integer> set = bruteForce(array);
        Set<Integer> set = better(array);

        for (int i : set) {
            System.out.print(i + " ");
        }

    }

    public static Set<Integer> bruteForce(int[] array) {
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int num = array[i];
            for (int j = 0; j < array.length; j++) {
                if (result.contains(num)) {
                    break;
                } else if (num == array[j]) {
                    count++;
                }
                if (count > array.length / 3) {
                    result.add(num);
                    break;
                }
                if (result.size() == 2) {
                    break;
                }
            }
        }
        return result;
    }

    public static Set<Integer> better(int[] array) {
        Set<Integer> result = new HashSet<>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (hash.containsKey(array[i])) {
                hash.put(array[i], hash.get(array[i]) + 1);
            } else {
                hash.put(array[i], 1);
            }

            if (hash.get(array[i]) > array.length / 3) {
                result.add(array[i]);
            }
        }
        return result;
    }
}
