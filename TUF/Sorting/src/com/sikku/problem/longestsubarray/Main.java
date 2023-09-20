package com.sikku.problem.longestsubarray;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 1, 3, 1};
//        subArr(array);

        int[] array = {1, 2,0,0,0,0,0, 3, 1, 1, 1, 1, 4, 2, 3};
        longestSubArrayForZeroAlso(array, 3);
    }

    //brute force solution O(n3)
    public static void subArray(int[] array) {
        int num = 15;
        int result = 0;

        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int k = i; k < n; k++) {
                int sum = 0;
                for (int j = i; j <= k; j++) {
//                    System.out.print(array[j]);
                    sum += array[j];
                }
                if (sum == num) {
                    int length = k - i + 1;
                    if (result < length) {
                        result = length;
                    }
                    System.out.println("result :" + result);
                }
//                System.out.println();
            }
        }
    }

    //brute force solution O(n2)
    public static void subArr(int[] array) {
        int num = 5;
        int result = 0;
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += array[j];
                if (sum == num) {
                    int length = j - i + 1;
                    if (result < length) {
                        result = length;
                    }
                    System.out.println("i: " + i + " j: " + j + " length: " + result);
                    break;
                }
            }
        }
    }

    //    code for all positive number greater than 0 (do not use this)
    public static void longestSubArray(int[] array, int k) {
        int low = 0, high = array.length - 1;
        int length = 0;
        int sum = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();

        while (low <= high) {
            sum += array[low];

            //checking first time length
            if (sum == k) {
                length = low + 1;
            }

            if (hash.containsKey(sum - k)) {
                int len = low - hash.get(sum - k);
                if (len > length) {
                    length = len;
                }
            }
            hash.put(sum, low);
            low++;
        }
        System.out.println(length);
    }

    //    for all number +ve and -ve
    public static void longestSubArrayForZeroAlso(int[] array, int k) {
        int low = 0, high = array.length - 1;
        int length = 0;
        int sum = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();

        while (low <= high) {
            sum += array[low];

            //checking first time length
            if (sum == k) {
                length = low + 1;
            }

            if (hash.containsKey(sum - k)) {
                int len = low - hash.get(sum - k);
                if (len > length) {
                    length = len;
                }
            }
            if (!hash.containsKey(sum)) {
                hash.put(sum, low);
            }
            low++;
        }
        System.out.println(length);
    }
}
