package com.sikku.sorting.quicksort;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 6, 2, 5, 7, 9, 1, 3, 78};

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

//        int position = pivotPosition(array,low,high);
//        int position = pivot(array, low, high);
        int position = pivotForDescending(array,low,high);
        quickSort(array, low, position - 1);
        quickSort(array, position + 1, high);
    }

    public static int pivotPosition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i <= j) {
            while (i <= j && array[i] <= pivot) {
                i++;
            }
            while (j >= i && array[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[low] = array[j];
        array[j] = pivot;
        return j;
    }

    public static int pivot(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i <= j) {
            while (i <= high && array[i] <= pivot) {
                i++;
            }
            while (j >= low && array[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        array[low] = array[j];
        array[j] = pivot;
        return j;
    }

    public static int pivotForDescending(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i <= j) {
            while (i <= high && array[i] >= pivot) {
                i++;
            }
            while (j >= low && array[j] < pivot) {
                j--;
            }
            if (i < j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        array[low] = array[j];
        array[j] = pivot;
        return j;
    }
}
