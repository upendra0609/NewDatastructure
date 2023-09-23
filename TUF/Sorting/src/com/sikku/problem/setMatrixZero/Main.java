package com.sikku.problem.setMatrixZero;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 0, 1, 1}};

//        better(array);
        optimal(array);

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void better(int[][] array) {
        int m = array.length;
        int n = array[0].length;
        int[] row = new int[m];
        int[] cols = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 0) {
                    row[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || cols[j] == 1) {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static void optimal(int[][] array) {
        int cols = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    array[i][0] = 0;
                    if (j != 0) {
                        array[0][j] = 0;
                    } else {
                        cols = 0;
                    }
                }
            }
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][0] == 0 || array[0][j] == 0) {
                    array[i][j] = 0;
                }
            }
        }

        //for column
        for (int i = array[0].length - 1; i >= 0; i--) {
            if (array[0][0] == 0) {
                array[0][i] = 0;
            }
        }

        //for rows
        for (int i = 0; i < array.length; i++) {
            if (cols == 0) {
                array[i][0] = 0;
            }
        }
    }
}
