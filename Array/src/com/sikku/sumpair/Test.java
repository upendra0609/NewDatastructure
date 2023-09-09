package com.sikku.sumpair;

public class Test {
    public static void main(String[] args) {
        sumOfPairs(new int[]{3, 10, -4, 15, -9, 20, 12, 25}, 38);
    }

    public static void sumOfPairs(int[] ar, int num) {

        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                if ((ar[i] + ar[j]) == num) {
                    System.out.println("ar[" + i + "] + ar[" + j + "] = " + num);
                    return;
                }
            }
        }
        System.out.println("no two number are having sum of "+ num);
    }
}
