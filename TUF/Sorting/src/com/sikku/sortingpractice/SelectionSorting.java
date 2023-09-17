package com.sikku.sortingpractice;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        selection(array, array.length);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selection(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            int min = Integer.MAX_VALUE;
            int index = i;
            for (int j = i; j < size; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[index] = temp;
        }
    }
}
