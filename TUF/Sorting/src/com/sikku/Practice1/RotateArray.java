package com.sikku.Practice1;

public class RotateArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8,}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        transpose(array);
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] array) {
        int m = array.length;

        for (int i = 0; i < m; i++) {
            int n = array[i].length;
            for (int j = i; j < n; j++) {
                int tem = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = tem;
            }
        }
    }
}
