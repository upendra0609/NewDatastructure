package com.sikku.sortingpractice;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);

    }

    public static void merge(int[] array, int low, int mid, int high) {
        int[] tempArray = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int i = 0;

        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                tempArray[i] = array[left];
                left++;
            } else {
                tempArray[i] = array[right];
                right++;
            }
            i++;
        }
        while (left <= mid) {
            tempArray[i] = array[left];
            left++;
            i++;
        }

        while (right <= high) {
            tempArray[i] = array[right];
            right++;
            i++;
        }

        for (int p = low; p <= high; p++) {
            array[p] = tempArray[p - low];
        }
    }
}
