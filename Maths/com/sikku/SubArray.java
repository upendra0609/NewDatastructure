package com.sikku;

import java.util.ArrayList;

public class SubArray {
    public static void main(String[] args) {
        subArray1(new int[]{1, 2, 3, 4});
    }

    public static void subArray(int[] ar) {
        int n = ar.length * (ar.length + 1) / 2;
        int start = 0;
        while (n > 0) {
            for (int i = start; i < ar.length; i++) {
                for (int j = start; j <= i; j++) {
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
            }
            start++;
            n--;
        }
    }

    public static void subArray1(int[] ar) {
       
    }
}
