package com.sikku;

public class RotateArray {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        rotate90(ar, 4);
//        rotateInCurrent(ar, 3);

//        for (int[] i : ar) {
//            for (int j : i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("/////////////");

//        rowToColumn(ar, ar.length);
//        for (int[] i : ar) {
//            for (int j : i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("////////////////////");

        rowToColumn(ar, ar.length);
        rotateInCurrent(ar, ar.length);
        for (int[] i : ar) {
            for (int j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static void rotate90(int[][] ar, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(ar[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateInCurrent(int[][] ar, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = ar[i][n - j - 1];
                ar[i][n - j - 1] = ar[i][j];
                ar[i][j] = temp;
            }
        }
    }

    public static void rowToColumn(int[][] ar, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
    }
}
