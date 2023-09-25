package com.sikku.problem.longestsubarrayKadane;

public class Kadane {
    public static void main(String[] args) {
        int[] array = {4,-2,5};
        System.out.println(maxSubArray(array));

    }

    public static int maxSubArray(int[] array) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
//            max = max < sum ? sum : max;
//            sum = sum < 0 ? 0 : sum;
            if (max < sum) {
                max = sum;
                end = i;  //for printing sub array
            }
            if (sum < 0) {
                sum = 0;
                start = i;  //for printing sub array
            }
        }

        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return max;
    }
}
