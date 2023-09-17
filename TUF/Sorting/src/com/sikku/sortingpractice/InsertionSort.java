package com.sikku.sortingpractice;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
        int[] array = {5, 4, 3, 2, 1};
        insertion(array, array.length);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertion(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
