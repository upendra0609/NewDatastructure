package com.sikku.rightMostSetBit;

public class Main {
    public static void main(String[] args) {
        rightMostSetBit(-2);
        System.out.println(Integer.toBinaryString(-2));
//        System.out.println(Integer.toBinaryString(8));
//        System.out.println(Integer.toBinaryString(-8));



    }

    public static void rightMostSetBit(int n) {
        if(n==0) return;
//        System.out.println(Integer.toBinaryString(n));
        int result = n & -n;
        int i = (int)(Math.log(result)/Math.log(2)) +1;
        System.out.println(i);
//        System.out.println(Integer.toBinaryString(result));
    }
}
