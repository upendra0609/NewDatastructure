package com.sikku.practice;

public class RotateClockwise {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4,11},
                {5, 6, 7, 8,22},
                {9, 10, 11, 12,33},
                {13, 14, 15, 16,44},
                {17,18,19,20,55}};

        for (int[] i: ar){
            for (int j: i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }

        System.out.println("/////////////////////////");
        rotate(ar,ar.length);

        for (int[] i: ar){
            for (int j: i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] ar, int size) {

        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size - i - 1; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[size - j - 1][i];
                ar[size - j - 1][i] = ar[size - i - 1][size - j - 1];
                ar[size - i - 1][size - j - 1] = ar[j][size - i - 1];
                ar[j][size - i - 1] = temp;
            }
        }
    }
}
