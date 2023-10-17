package com.sikku.binarySearching.SearchIn2dArray;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{3, 4, 7, 9},
                {12, 13, 16, 18},
                {20, 21, 23, 29}
        };
        System.out.println(brute(array, 18));
    }

    public static boolean brute(int[][] array, int target) {
        int m = array.length;

        for (int i = 0; i < m; i++) {
            int n = array[i].length;
            for (int j = 0; j < n; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
