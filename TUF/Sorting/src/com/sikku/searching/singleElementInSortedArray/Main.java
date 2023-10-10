package com.sikku.searching.singleElementInSortedArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7};
//        System.out.println(brute(array));
        System.out.println(optimal(array));

        ArrayList<Integer> ar = new ArrayList<>();

    }

    public static int brute(int[] array) {
        //for single element in array
        if (array.length == 1) {
            return array[0];
        }
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            //checking for first element
            if (low == 0) {
                if (array[low] != array[low + 1]) return array[low];
            }
            //checking for last element
            else if (low == array.length - 1) {
                if (array[low] != array[low - 1]) return array[low];
            } else if (array[low] != array[low - 1] && array[low] != array[low + 1]) {
                return array[low];
            }
            low++;
        }
        return -1;
    }

    public static int optimal(int[] array) {
        //checking for single element in array
        if (array.length == 1) return array[0];

        int low = 0;
        int high = array.length - 1;

        // checking for first element
        if (array[low] != array[low + 1]) return array[low];
        // checking for last element
        if (array[high] != array[high - 1]) return array[high];
        low++;
        high--;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] != array[mid - 1] && array[mid] != array[mid + 1]) {
                return array[mid];
            } else if (mid % 2 == 0) {
                if (array[mid] == array[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (array[mid] == array[mid + 1]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
