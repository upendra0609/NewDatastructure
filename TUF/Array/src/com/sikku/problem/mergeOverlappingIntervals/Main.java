package com.sikku.problem.mergeOverlappingIntervals;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{5, 2}, {16, 21}, {1, 3}, {2, 6}, {8, 10}, {9, 19}, {15, 18}};

        int[][] ar = overlappingInterval(array);
        for (int[] i : ar) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] overlappingInterval(int[][] array) {
        Stack<int[]> list = new Stack<>();
        Arrays.sort(array, (I1, I2) -> I1[0] - I2[0]);
        list.push(new int[]{array[0][0], array[0][1]});

        for (int i = 1; i < array.length; i++) {
            if (array[i][0] <= list.peek()[1]) {
//                if (array[i][0] <= list.peek()[0]) {
//                    list.peek()[0] = array[i][0];
//                }
                if (array[i][1] > list.peek()[1]) {
                    list.peek()[1] = array[i][1];
                }
            } else {
                list.push(new int[]{array[i][0], array[i][1]});
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
