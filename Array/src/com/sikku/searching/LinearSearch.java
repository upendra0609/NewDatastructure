package com.sikku.searching;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(isPresent(new int[]{1, 2, 3, 4, 5}, 8));

    }

    public static boolean isPresent(int[] ar, int n) {

        for (int i : ar) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}
