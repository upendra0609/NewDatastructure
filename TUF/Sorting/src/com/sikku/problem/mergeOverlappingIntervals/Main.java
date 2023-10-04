package com.sikku.problem.mergeOverlappingIntervals;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{3, 4}, {6, 7}, {1, 7}, {1, 3},{1,3},{1,2},{1,9}};

        Arrays.sort(array, (i1, i2) -> {
            int x = i1[0];
            int y = i1[1];
            int p = i2[0];
            int q = i2[1];
            if (x < p) {
                return -1;
            } else if (x == p && y < q) {
                return -1;
            } else if (p == x && q==y) {
                return 0;
            } else {
                return 1;
            }
        });

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
