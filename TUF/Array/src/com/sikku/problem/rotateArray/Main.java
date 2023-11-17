package com.sikku.problem.rotateArray;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
//        rotate(array);
        rotateTUF(array);

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // T.C. -> less than O(n^2)
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

    public static void rotateTUF(int[][] array) {

        //transpose the array
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        //reverse array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][array[i].length - j - 1];
                array[i][array[i].length - j - 1] = temp;

            }
        }
    }
}
