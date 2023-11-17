package com.sikku.practice;

public class MoveZeroAtLast {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 0, 0, 4, 5, 0, 8, 0};
        moveZero(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void moveZero(int[] array) {
        int i = 0;


        while (array[i] != 0) {
            i++;
        }
        int j = i + 1;

        while (j < array.length) {
            if (array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
                i++;
            }
            j++;
        }
    }
}
