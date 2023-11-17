package com.sikku.problem.zeroesonestwos;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 2, 2, 0, 1, 1, 0, 1};
        optimal(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void optimal(int[] array) {
        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while (mid <= high) {
            if (array[mid] == 0) {
                int temp = array[mid];
                array[mid] = array[low];
                array[low] = temp;
                mid++;
                low++;
            } else if (array[mid] == 1) {
                mid++;
            } else if (array[mid] == 2) {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
    }
}
