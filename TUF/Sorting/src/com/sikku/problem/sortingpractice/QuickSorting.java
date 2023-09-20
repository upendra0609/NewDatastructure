package com.sikku.problem.sortingpractice;

public class QuickSorting {
    public static void main(String[] args) {
        int[] array = {9,8,3,5,7,23,7,842,0};
        quickSort(array, 0 , array.length-1);

        for (int i: array){
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if(low>=high){
            return;
        }

        int pivotPosition = pivotPosition(array, low, high);
        quickSort(array,low, pivotPosition-1);
        quickSort(array, pivotPosition+1, high);
    }

    public static int pivotPosition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i <= j) {
            while (i<=j && array[i] <= pivot){
                i++;
            }
            while (j>=i && array[j] > pivot){
                j--;
            }

            if(i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        array[low] = array[j];
        array[j] = pivot;
        return j;
    }
}
