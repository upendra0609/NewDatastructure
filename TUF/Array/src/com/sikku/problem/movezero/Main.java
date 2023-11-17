package com.sikku.problem.movezero;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveTUF(array, array.length);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //relative order of non-zero element is not maintained
    public static void moveZeroToEnd(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            while (array[low] != 0) {
                low++;
            }

            while (array[high] == 0) {
                high--;
            }
            if (low < high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high--;
            }
        }
    }

    public static void moveMyOptimal(int[] array, int size) {
        int low = 0;
        int high = 1;

        while (high < size && low < high) {
            while (low < size && array[low] != 0) {
                low++;
            }
            high = low + 1;

            while (high < size && array[high] == 0) {
                high++;
            }
            if (high < size && low < high) {
                int temp = array[high];
                array[high] = array[low];
                array[low] = temp;
            }
        }
    }

    public static void moveTUF(int[] array, int size) {
        int j = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < size; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
    }
}
