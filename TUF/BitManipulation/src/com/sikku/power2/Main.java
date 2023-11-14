package com.sikku.power2;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(12));
    }

    public static boolean isPowerOfTwo(int n) {
        return n>0 && ((n & (n-1)) ==0);
    }
}
