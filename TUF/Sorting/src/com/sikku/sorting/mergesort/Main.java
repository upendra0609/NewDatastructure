package com.sikku.sorting.mergesort;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 6, 5, 4, 3, 2, 1};
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
        int left = low;
        int right = mid + 1;

        int[] temp = new int[high-low + 1];
        int i = 0;

//        merging into sorted array
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp[i] = array[left];
                left++;
            } else {
                temp[i] = array[right];
                right++;
            }
            i++;
        }

        while (left <= mid) {
            temp[i] = array[left];
            left++;
            i++;
        }

        while (right <= mid) {
            temp[i] = array[right];
            right++;
            i++;
        }

//        copying to original array
        for (int j: temp){
            array[low] = j;
            low++;
        }

//        for (int j = low; j <= high; j++) {
//            array[j] = temp[j-low];
//        }
    }
}
