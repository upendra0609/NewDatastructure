package com.sikku.rightMostSetBit;

public class Main {
    public static void main(String[] args) {
        rightMostSetBit(76);

        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(-8));

    }

    public static void rightMostSetBit(int n) {
        System.out.println(Integer.toBinaryString(n));
        int result = n & -n;
        System.out.println(Integer.toBinaryString(result));
    }
}
