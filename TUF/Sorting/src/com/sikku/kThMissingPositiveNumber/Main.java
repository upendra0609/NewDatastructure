package com.sikku.kThMissingPositiveNumber;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(brute(array, 2));
    }

    public static int brute(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > k) {
                break;
            }
            k++;
        }
        return k;
    }

    public static int optimal(int[] arr, int k) {
        if (k < arr[0]) {
            return k;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            //total missing number till mid-index
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
}
