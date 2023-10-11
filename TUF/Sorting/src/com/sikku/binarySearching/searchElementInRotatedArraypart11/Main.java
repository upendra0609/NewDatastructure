package com.sikku.binarySearching.searchElementInRotatedArraypart11;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3};
        System.out.println(search(array, 3));
    }

    public static boolean search(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return true;
            }
            if (array[low] == array[mid] && array[mid] == array[high]) {
                low += 1;
                high -= 1;
                continue;
            }
            if (array[low] <= array[mid]) {
                if (array[low] <= target && array[mid] >= target && array[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (array[mid] <= array[high]) {
                if (array[mid] <= target && array[high] >= target && array[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
