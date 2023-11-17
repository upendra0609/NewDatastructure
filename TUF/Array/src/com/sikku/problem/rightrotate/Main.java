package com.sikku.problem.rightrotate;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        rotateRight(array, 3);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void rotateRight(int[] array, int rotateBy) {
        rotateBy %= array.length;

        reverse(array, 0, array.length - 1);
        reverse(array, 0, rotateBy - 1);
        reverse(array, rotateBy, array.length - 1);
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
