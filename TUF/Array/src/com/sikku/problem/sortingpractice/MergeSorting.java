package com.sikku.problem.sortingpractice;

public class MergeSorting {
    public static void main(String[] args) {
        int[] array = {9, 7, 2, 1, 4, 7, 9, 4, 23, 0};
        mergeSort(array, 0, array.length-1);

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
        int tempIndex = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                tempArray[tempIndex] = array[left];
                left++;
            } else {
                tempArray[tempIndex] = array[right];
                right++;
            }
            tempIndex++;
        }

        while (left <= mid) {
            tempArray[tempIndex] = array[left];
            left++;
            tempIndex++;
        }

        while (right <= high) {
            tempArray[tempIndex] = array[right];
            right++;
            tempIndex++;
        }

        for (int i = 0; i < tempArray.length; i++) {
            array[i + low] = tempArray[i];
        }
    }
}
