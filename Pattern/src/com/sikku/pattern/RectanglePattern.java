package com.sikku.pattern;

public class RectanglePattern {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        int size = 2 * n - 1;
        int[][] ar = new int[size][size];
        int start = 0;
        int end = 2 * n - 1;
        while (n != 0) {
            for (int i = start; i < end; i++) {
                for (int j = start; j < end; j++) {
                    if (i == start || i == end - 1 || j == start || j == end - 1) {
                        ar[i][j] = n;
                    }
                }
            }
            start++;
            end--;
            n--;
        }

        for (int[] i : ar) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
