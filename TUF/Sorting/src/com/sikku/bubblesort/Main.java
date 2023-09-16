package com.sikku.bubblesort;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        for (int i = 0; i < array.length; i++) {
            int didSwap = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
