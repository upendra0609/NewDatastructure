package com.sikku.sortingpractice;

public class QuickSort {
    public static void main(String[] args) {
//        int[] array = {2, 6, 3, 4, 7, 1, 2, 7};
        int[] array = {1,1,1,1,1,1,2,1};
        quick(array,0,array.length-1);

        for (int i: array){
            System.out.print(i+" ");
        }
    }

    public static void quick(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotPosition = pivotPosition(array,low,high);
        quick(array,low,pivotPosition-1);
        quick(array,pivotPosition+1,high);

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
