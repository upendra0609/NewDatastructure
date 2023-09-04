package com.sikku;

public class Rotate90Degree {
    public static void main(String[] args) {
        int[][] ar = {{1, 2}, {7, 8}};
        rotate(ar, 2);

        for (int[] i : ar) {
            for (int j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] ar, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[n - j - 1][i];
                ar[n - j - 1][i] = ar[n - i - 1][n - j - 1];
                ar[n - i - 1][n - j - 1] = ar[j][n - i - 1];
                ar[j][n - i - 1] = temp;
            }
        }
    }
}
