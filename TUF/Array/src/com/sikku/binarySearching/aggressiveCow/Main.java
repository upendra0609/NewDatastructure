package com.sikku.binarySearching.aggressiveCow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 3, 4, 7, 9, 10};
        System.out.println(optimal(array, 4));
    }

    public static int brute(int[] array, int cows) {
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        int start = 0;

        while (start <= (max - min)) {
            int count = 1;
            int prev = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] - array[prev] > start) {
                    prev = i;
                    count++;
                }
                if (count == cows) break;
            }
            if (count < cows) break;
            start++;
        }
        return start;
    }

    public static int optimal(int[] array, int cows) {
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        int start = 0;
        int high = max - min;
        int ans = 0;

        while (start <= high) {
            int count = 1;
            int prev = 0;
            int mid = (start + high) / 2;
            for (int i = 1; i < array.length; i++) {
                if (array[i] - array[prev] >= mid) {
                    prev = i;
                    count++;
                }
            }
            if (count < cows) {
                high = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
