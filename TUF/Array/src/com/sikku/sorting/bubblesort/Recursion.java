package com.sikku.sorting.bubblesort;

public class Recursion {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2};
//        int[] array = {1, 2, 3, 4, 5};

        bubble(array, array.length);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubble(int[] array, int size) {
        if (size == 1) {
            return;
        }

        int swap = 0;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                swap++;
            }
        }
        if (swap == 0) {
            return;
        }
        bubble(array, size - 1);
    }

}
