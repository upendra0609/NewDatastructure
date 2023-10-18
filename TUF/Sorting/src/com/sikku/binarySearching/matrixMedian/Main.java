package com.sikku.binarySearching.matrixMedian;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 5, 7, 9, 11}, {2, 3, 4, 5, 10}, {9, 10, 12, 14, 16}};
        System.out.println(optimal(array, array.length, array[0].length));
    }

    public static int optimal(int[][] matrix, int m, int n) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }
        int required = (m * n) / 2;
        // int ans =0;

        while (low <= high) {
            int mid = (low + high) / 2;
            int count = countSmallEqual(matrix, mid, m, n);
            if (count <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
                // ans = mid;
            }
        }
        return low;
    }

    public static int countSmallEqual(int[][] matrix, int target, int m, int n) {

        int count = 0;
        for (int i = 0; i < m; i++) {
            int index = -1;
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (matrix[i][mid] <= target) {
                    index = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            count += index + 1;
        }
        return count;
    }

}
