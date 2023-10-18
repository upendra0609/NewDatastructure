package com.sikku.binarySearching.peakElement2dArray;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{2,3,5,9},
                {1,5,8,12},
                {4,12,13,22},
                {8,10,16,23}};
        int[] ar = optimal(array);
        for (int i: ar){
            System.out.print(i+" ");
        }

    }

    public static int[] optimal(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = maxIndex(mat, mid, m);
            int left = mid == 0 ? -1 : mat[row][mid - 1];
            int right = mid == n - 1 ? -1 : mat[row][mid + 1];
            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row, mid};
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return new int[]{-1, -1};
    }

    public static int maxIndex(int[][] array, int col, int m) {
        int max = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < m; i++) {
            if (max < array[i][col]) {
                max = array[i][col];
                row = i;
            }
        }
        return row;
    }
}
