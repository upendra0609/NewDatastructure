package com.sikku.binarySearching.bookAllocation;

public class Main {
    public static void main(String[] args) {
        int[] array = {8,15,3};
        System.out.println(optimal(array, 2));
    }

    public static int brute(int[] array, int students) {
        if (students > array.length) {
            return -1;
        }

        int min = Integer.MIN_VALUE;
        int max = 0;
        for (int i : array) {
            min = Math.max(min, i);
            max += i;
        }

        while (min <= max) {
            int sum = 0;
            int count = 1;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                if (sum > min) {
                    count++;
                    sum = array[i];
                } else if (sum == min) {
                    count++;
                    sum = 0;
                }
            }
            if (count == students) return min;
            min++;
        }
        return -1;
    }

    
}
