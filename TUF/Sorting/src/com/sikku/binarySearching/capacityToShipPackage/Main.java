package com.sikku.binarySearching.capacityToShipPackage;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(optimal(array, 5));
    }

    public static int brute(int[] weight, int days) {
        int max = 0;
        int min = Integer.MIN_VALUE;
        for (int i : weight) {
            max += i;
            min = Math.max(min, i);
        }

        while (min <= max) {
            int sum = 0;
            int d = 1;
            for (int i : weight) {
                if (sum + i <= min) {
                    sum += i;
                } else {
                    d++;
                    sum = i;
                }
            }
            if (d == days) {
                return min;
            }
            min++;
        }
        return -1;
    }

    
}
