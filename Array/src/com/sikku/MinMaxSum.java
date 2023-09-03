package com.sikku;

import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        int[] arr = {9,1,5,3,4};
        int sum = sum(arr);
        int maxSum = sum - min(arr);
        System.out.println(maxSum);

        int minSum = sum - max(arr);
        System.out.println(minSum);

    }

    public static int sum(int[] arr){
        int sum =0;
        for (int i: arr){
            sum +=i;
        }
        return sum;
    }
    public static int min(int[] ar){
        int min = Integer.MAX_VALUE;

        for (int j : ar) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int max(int[] ar){
        int max = Integer.MIN_VALUE;

        for (int j : ar) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
