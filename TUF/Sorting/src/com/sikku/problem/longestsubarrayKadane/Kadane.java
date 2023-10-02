package com.sikku.problem.longestsubarrayKadane;

public class Kadane {
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3, 8};
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

        for (int i = start + 1; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return max;
    }
}
