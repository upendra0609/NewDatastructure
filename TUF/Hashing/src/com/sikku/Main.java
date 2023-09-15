package com.sikku;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 3, 5, 2, 7, 3, 7};
        int[] hash = new int[12]; //maximum number array is having is 11

        for (int i : array) {
            hash[i] +=1;
        }

        System.out.println(hash[7]);
        System.out.println(hash[2]);
        System.out.println(hash[9]);
        System.out.println(hash[11]);
    }
}
