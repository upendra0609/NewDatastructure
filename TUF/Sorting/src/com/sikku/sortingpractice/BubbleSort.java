package com.sikku.sortingpractice;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] array = {5, 4, 3, 2, 1};
        int[] array = {1,2,3,4,5};
        bubble(array, array.length);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void bubble(int[] array, int size) {
        int swap = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = 1;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
}
