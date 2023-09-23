package com.sikku.problem.rotateArray;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        rotate(array);

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = array[i][j];
                array[i][j] = array[n - j - 1][i];
                array[n - j - 1][i] = array[n - i - 1][n - j - 1];
                array[n - i - 1][n - j - 1] = array[j][n - i - 1];
                array[j][n - i - 1] = temp;
            }
        }
    }
}
