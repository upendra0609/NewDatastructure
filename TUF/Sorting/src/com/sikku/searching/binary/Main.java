package com.sikku.searching.binary;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 7, 8, 9, 12, 16, 17};
        int res = recursiveBinary(array, 3, 0, array.length - 1);
        System.out.println(res);
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int recursiveBinary(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            low = mid + 1;
        } else if (array[mid] > target) {
            high = mid - 1;
        }
        return recursiveBinary(array, target, low, high);
    }
}
