package com.sikku.binarySearching.smallestDivisorGivenThreshold;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 9};
        System.out.println(optimal(array, 6));
    }

    public static int brute(int[] array, int threshold) {
        if (threshold < array.length) {
            return -1;
        }
        int min = 1;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            max = Math.max(max, i);
        }

        while (min <= max) {
            int sum = 0;
            for (int i : array) {
                sum += Math.ceil((double) i / min);
            }
            if (sum <= threshold) return min;
            min++;
        }
        return -1;
    }

    public static int optimal(int[] array, int threshold) {
        if (threshold < array.length) {
            return -1;
        }
        int min = 1;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            max = Math.max(max, i);
        }
        int ans = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            int sum = 0;
            for (int i : array) {
                sum += Math.ceil((double) i / mid);
            }
            if (sum <= threshold) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }
}
