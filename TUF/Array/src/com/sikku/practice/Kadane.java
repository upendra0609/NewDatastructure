package com.sikku.practice;

public class Kadane {
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3,8};
        kadaneAlg(array);
    }

    public static void kadaneAlg(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;


        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > max) {
                max = sum;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(start+" "+end);
    }
}
