package com.sikku.sorting.insertionsort;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 22, 9, 8, 6, 4, 1};
//        int[] array = {1,2,3,4,5,6,7,8,9};
        insertionSort(array, array.length);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void insertionSort(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
