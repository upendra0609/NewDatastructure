package com.sikku;

public class BorderOddSum {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(oddSum(ar, 4));

    }

    public static int oddSum(int[][] ar, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    if (ar[i][j] % 2 != 0) {
                        result += ar[i][j];
                    }
                }
            }
        }
        return result;
    }
}
