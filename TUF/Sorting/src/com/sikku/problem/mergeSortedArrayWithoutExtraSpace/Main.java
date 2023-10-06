package com.sikku.problem.mergeSortedArrayWithoutExtraSpace;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {0, 2, 6, 8, 9};
//        merge(array1, array2);
        gapMethod(array1, array2);

    }

    public static void merge(int[] array1, int[] array2) {
        int m = array1.length - 1;
        int n = array2.length - 1;
        if (m > n) {
            merge(array2, array1);
        }
        int count = 0;
        int i = 0;
        while (m >= 0) {
            count++;
            if (array2[i] < array1[m]) {
                int temp = array2[i];
                array2[i] = array1[m];
                array1[m] = temp;
                m--;
                i++;
            } else {
                Arrays.sort(array1);
                Arrays.sort(array2);
                break;
            }
        }
        System.out.println(count);
    }

    public static void gapMethod(int[] array1, int[] array2) {
        int m = array1.length;
        int n = array2.length;
        int gap = ((m + n));

        while (gap != 1) {
            gap = (int) Math.ceil((double) gap / 2);
            int left = 0;
            int right = left + gap;
            while (left < m || right < (m + n)) {
                if (right < m) {
                    if (array1[left] > array1[right]) {
                        int temp = array1[left];
                        array1[left] = array1[right];
                        array1[right] = temp;
                    }
                } else {
                    int i = right % m;
                    if (array1[left] > array2[i]) {
                        int temp = array1[left];
                        array1[left] = array2[i];
                        array2[i] = temp;
                    }
                }
                right++;
                left++;
            }
        }
    }
}
