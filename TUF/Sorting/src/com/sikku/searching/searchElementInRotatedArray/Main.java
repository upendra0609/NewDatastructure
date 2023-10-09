package com.sikku.searching.searchElementInRotatedArray;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,0,1,1,1};
        System.out.println(search(array, 0));
    }

    public static int search(int[] array, int target) {
        int result = -1;
        int low = 0;
        int high = array.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[low] <= array[mid]) {
                if (array[low] <= target && array[mid] >= target) {
                    if (array[mid] == target) {
                        return mid;
                    } else if (array[mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    low = mid + 1;
                }
            } else if (array[mid] <= array[high]) {
                if (array[mid] <= target && array[high] >= target) {
                    if (array[mid] == target) {
                        return mid;
                    } else if (array[mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    high = mid - 1;
                }
            }
        }
        return result;
    }
}
