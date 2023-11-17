package com.sikku.binarySearching.searchIn2dArray1;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {16, 21, 23, 26, 30}
        };
        System.out.println(optimal(array, 5));
    }

    public static boolean optimal(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
