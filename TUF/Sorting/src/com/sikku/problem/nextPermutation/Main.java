package com.sikku.problem.nextPermutation;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,3,9,5,4,2,0,0};
        nextPer(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void nextPer(int[] array) {
        int index = -1;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index != -1) {
            for (int i = array.length - 1; i > index; i--) {
                if (array[i] > array[index]) {
                    int temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;
                    break;
                }
            }
        }
        reverse(array, index + 1, array.length - 1);
    }

    public static void reverse(int[] array, int low, int high) {
        int i = low;
        int j = high;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
