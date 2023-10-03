package com.sikku.practice;

public class DutchFlag {
    public static void main(String[] args) {
        int[] array = {2, 2, 1, 0, 0, 1,0,0};

        for (int i: array){
            System.out.print(i+" ");
        }
    }

    public static void sort(int[] array) {
        int mid = 0;
        int low = 0;
        int high = array.length - 1;

        while (mid <= high) {
            if (array[mid] == 0) {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            } else if (array[mid] == 1) {
                mid++;
            } else if (array[mid] == 2) {
                int temp = array[high];
                array[high] = array[mid];
                array[mid] = temp;
                high--;
            }
        }
    }
}
