package com.sikku.problem.missingnumber;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int missing = 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if ((i + 1) == missing) {
                continue;
            }
            array[i] = i + 1;
        }

//        System.out.println(missing(array, array.length));
        System.out.println(xor(array, array.length));
    }

    public static int missing(int[] array, int size) {
        int totalSum = (size * (size + 1) / 2);

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        return totalSum - sum;
    }

    public static int xor(int[] array, int size) {
        int xor1 = 0;
//        for (int i = 1; i <= size; i++) {
//            xor1 = xor1 ^ i;
//        }

        int xor2 = 0;
        for (int i = 0; i < size; i++) {
            xor2 = xor2 ^ array[i];
            xor1 = xor1 ^ (i+1);
        }
        return xor1 ^ xor2;
    }
}
