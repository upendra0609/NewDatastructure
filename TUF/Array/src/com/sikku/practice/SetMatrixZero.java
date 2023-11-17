package com.sikku.practice;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {0, 0, 0, 1}};
        setZero(array);

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void setZero(int[][] array) {
        int var = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    if (j == 0) {
                        var = 0;
                    } else {
                        array[0][j] = 0;
                    }
                    array[i][0] = 0;
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

        for (int i = 1; i < array[0].length; i++) {
            if (array[0][0] == 0) {
                array[0][i] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (var == 0) {
                array[i][0] =0;
            }
        }
    }
}
