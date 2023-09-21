package com.sikku.twosum;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
//        quickSort(array, 0, array.length - 1);
//
//        for (int i : array) {
//            System.out.print(i + " ");
//        }

        twoSum(array, 9);

    }

    public static void twoSum(int[] array, int k) {
        quickSort(array, 0, array.length - 1);
        int i = 0;
        int j = array.length - 1;
        int sum = 0;
        while (i <= j) {
            sum = array[i] + array[j];

            if (sum == k) {
                System.out.println("yes\ni :"+i+"\nj :"+j);
                return;
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }

        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotPosition = pivotPosition(array, low, high);
        quickSort(array, low, pivotPosition - 1);
        quickSort(array, pivotPosition + 1, high);
    }

    public static int pivotPosition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (array[i] <= pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i < j) {
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
