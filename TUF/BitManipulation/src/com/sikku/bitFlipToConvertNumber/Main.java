package com.sikku.bitFlipToConvertNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(minBitFlip(10,7));
    }

    public static int minBitFlip(int start, int goal) {
        return bitCount(start ^ goal);
    }

    public static int bitCount(int n) {
        int count = 0;

        while (n != 0) {
            int rsb = n & (-n);
            n -= rsb;
            count++;
        }
        return count;
    }
}
