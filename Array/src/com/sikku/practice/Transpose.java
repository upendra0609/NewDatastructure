package com.sikku.practice;

public class Transpose {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        for (int[] i : ar) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("/////////////////");
        transpose(ar, ar.length);

        for (int[] i : ar) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] ar, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
    }
}
