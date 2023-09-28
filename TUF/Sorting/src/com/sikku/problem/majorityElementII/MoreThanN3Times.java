package com.sikku.problem.majorityElementII;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoreThanN3Times {
    public static void main(String[] args) {
        int[] array = {1, 1, 7, 3, 3, 2, 2,5};
        Set<Integer> set = bruteForce(array);

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
                if (num == array[j]) {
                    count++;
                }
            }
            if (count > array.length / 3) {
                result.add(num);
            }
        }

        return result;

    }
}
