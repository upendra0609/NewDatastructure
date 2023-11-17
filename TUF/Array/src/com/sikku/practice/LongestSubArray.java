package com.sikku.practice;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2};
        longest(array, 3);
    }

    public static void longest(int[] array, int k) {
        int i = -1;
        int j = 0;

        int sum = 0;
        int length = 0;


        while (sum < k) {
            i++;
            sum += array[i];
        }

        while (i < array.length) {
            if (sum < k) {
                i++;
                sum += array[i];
            } else if (sum == k) {
                int len = i - j + 1;
                if (length < len) {
                    length = len;
                }
                i++;
                sum += array[i];
            } else {
                sum -= array[j];
                j++;
            }
        }
    }
}
