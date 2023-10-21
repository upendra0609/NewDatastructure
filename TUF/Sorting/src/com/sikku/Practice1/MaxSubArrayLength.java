package com.sikku.Practice1;

public class MaxSubArrayLength {
    public static void main(String[] args) {
        int[] array = {3, 4, 4,4,4,4};
        System.out.println(arrLength(array, 3));
    }

    public static int arrLength(int[] array, int target) {
        int length = 0;
        int i = 0;
        int j = -1;
        long sum = 0;
        while (j < array.length) {
            while (i < j && sum > target) {
                sum -= array[i];
                i++;
            }
            if (sum == target) {
                if (j - i + 1 > length) {
                    length = j - i + 1;
                }
            }
            j++;
            if (j < array.length) {
                sum += array[j];
            }
        }
        return length;
    }
}
