package com.sikku;

public class SymmetryArray {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3}, {2, 4, 7}, {3, 7, 5}};
        int n = ar.length;

        System.out.println(isSymmetry(ar, n));

//        copyArray(ar, n);
//
//        for (int[] i : ar) {
//            for (int j : i) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
    }

    public static boolean isSymmetry(int[][] matrix, int n) {
        int[][] newArray = copyArray(matrix, n);

        boolean isSymmetry = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != newArray[i][j]) {
                    break;
                }
                if (!isSymmetry) {
                    break;
                }
            }
        }
        return isSymmetry;
    }

    public static int[][] copyArray(int[][] ar, int n) {
        int[][] newArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArray[i][j] = ar[j][i];
            }
        }

        return newArray;
    }
}