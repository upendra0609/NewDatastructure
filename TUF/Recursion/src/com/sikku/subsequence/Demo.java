package com.sikku.subsequence;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17,18,19,20}};
        List<Integer> list = spiralPathMatrix(array, array.length, array[0].length);

        for (int i : list) {
            System.out.print(i + "  ");
        }

    }

    public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int right = n - 1;
        int left = 0;
        int top = 0;
        int bottom = m - 1;

        while (top <= bottom && left <= right) {
            if (right >= left) {
                for (int i = 0; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
            }

            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
            }

            if (top <= bottom) {
                if (right >= left) {
                    for (int i = right; i >= left; i--) {
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
            }


            if (right >= left) {
                if (top <= bottom) {
                    for (int i = bottom; i > top; i--) {
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
            }
        }

        return list;

    }
}


