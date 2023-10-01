package com.sikku.problem.fourSum;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,2,3,4,6,7,8,9,10,11,12,13};
        System.out.println(ceil(array));
    }

    public static int ceil(int[] array) {
        int num = 1;
        int result = Integer.MAX_VALUE;

        int i = 0;
        int j = array.length - 1;
        int mid = (i + j) / 2;

        while (i <= mid && j >= mid) {
            if (array[mid] == num) {
                return array[mid];
            } else if (array[mid] < num) {
                i = mid + 1;
            } else {
                result = array[mid];
                j = mid - 1;
            }
            mid = (i + j) / 2;
        }
        return result;
    }
}