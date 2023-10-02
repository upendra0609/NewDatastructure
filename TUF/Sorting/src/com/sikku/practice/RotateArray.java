package com.sikku.practice;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        rotateLeft(array,2);

        for (int i: array){
            System.out.print(i+" ");
        }

    }

    public static void rotateLeft(int[] array, int k){
        reverse(array, 0, array.length-1);
        reverse(array, 0, k-1);
        reverse(array, k, array.length-1);
    }

    public static void reverse(int[] array, int low, int high) {

        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }
}
