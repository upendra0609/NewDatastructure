package com.sikku.insertionsort;

public class Recursion {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        insertion(array, 0, array.length);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertion(int[] array, int low, int size) {
        if (low >= size) {
            return;
        }

        for (int i = low; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }
        insertion(array, low + 1, size);
    }
}
