package com.sikku.searching.singleElementInSortedArray;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(brute(array));
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
}
