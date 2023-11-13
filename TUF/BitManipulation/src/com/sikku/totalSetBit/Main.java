package com.sikku.totalSetBit;

public class Main {
    public static void main(String[] args) {
        int[] array = countBits(10);
    }

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            result[i] = result[i / 2] + i % 2;
        }
        return result;
    }
}
