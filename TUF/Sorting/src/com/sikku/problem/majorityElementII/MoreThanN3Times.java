package com.sikku.problem.majorityElementII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoreThanN3Times {
    public static void main(String[] args) {
        int[] array = { 2, 2};
//        Set<Integer> set = bruteForce(array);
//        Set<Integer> set = better(array);

        Set<Integer> set = optimal(array);

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

    public static Set<Integer> optimal(int[] array) {
        Set<Integer> result = new HashSet<>();

        int ele1 = 0;
        int count1 = 0;
        int ele2 = 0;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (count1 == 0 && array[i] != ele2) {
                ele1 = array[i];
                count1 = 1;
            } else if (count2 == 0 && array[i] != ele1) {
                ele2 = array[i];
                count2 = 1;
            } else if (ele1 == array[i]) {
                count1++;
            } else if (ele2 == array[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        if (count2 > 0 || count1 > 0) {
            count1 = 0;
            count2 = 0;
            //confirming if exist more than n/3 times
            for (int i = 0; i < array.length; i++) {
                if (ele1 == array[i]) {
                    count1++;
                    if (count1 > array.length / 3) {
                        result.add(ele1);
                    }
                } else if (ele2 == array[i]) {
                    count2++;
                    if (count2 > array.length / 3) {
                        result.add(ele2);
                    }
                }
            }
        }

        return result;
    }
}
