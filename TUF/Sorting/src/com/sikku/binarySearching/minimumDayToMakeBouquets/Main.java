package com.sikku.binarySearching.minimumDayToMakeBouquets;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 10, 3, 10, 2};
        System.out.println(brute(array, 3, 1));
    }

    public static int brute(int[] array, int n, int k) {
        int minimumDay = Arrays.stream(array).min().orElse(0);
        int maximumDay = Arrays.stream(array).max().orElse(0);

        if (n * k > array.length) {
            return -1;
        }

        while (minimumDay <= maximumDay) {
            int index = 0;
            int count = 0;
            int x = n;
            while (index < array.length) {
                if (array[index] <= minimumDay) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= k) {
                    x -= count / k;
                    count -= k;
                }
                index++;
            }
            if (x == 0) return minimumDay;
            minimumDay++;
        }
        return -1;
    }

    public static int optimal(int[] array, int n, int k) {
        int minimumDay = Arrays.stream(array).min().orElse(0);   //orElse(0) bcz Arrays.stream(array).min() return Optional and if this return null in that case we are returning 0
        int maximumDay = Arrays.stream(array).max().orElse(0);

        if (n * k > array.length) {
            return -1;
        }

        int result = -1;

        while (minimumDay <= maximumDay) {
            int mid = (minimumDay + maximumDay) / 2;
            int index = 0;
            int count = 0;
            int x = n;  //number of bouquets
            while (index < array.length) {
                if (array[index] <= mid) {
                    count++;
                } else {
                    count = 0;
                }

                if (count >= k) {
                    x -= count / k;
                    count -= k;
                }
                index++;
            }
            if (x <= 0) {
                result = mid;
                maximumDay = mid - 1;
            } else {
                minimumDay = mid + 1;
            }
        }
        return result;
    }
}
