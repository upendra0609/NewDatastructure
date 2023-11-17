package com.sikku.binarySearching.rowWithMaximumNoOf1s;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0,},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        System.out.println(optimal(array));
    }

    public static int brute(int[][] array) {
        int index = -1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    temp++;
                }
            }
            if (count < temp) {
                count = temp;
                index = i;
            }
        }

        return index;
    }

    public static int optimal(int[][] array) {
        int index = -1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int low = 0;
            int high = array[i].length - 1;
            int temp = 0;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (array[i][mid] == 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                    temp = array[i].length - mid;
                }
            }
            if (count < temp) {
                count = temp;
                index = i;
            }
        }
        return index;
    }

    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> array, int n, int m) {
        int index = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            int temp = 0;
            for (int j = 0; j < m; j++) {
                int mid = (low + high) / 2;
                if (array.get(i).get(mid) == 1) {
                    high = mid - 1;
                    temp = m - mid;
                } else {
                    low = mid + 1;
                }
            }
            if (count < temp) {
                count = temp;
                index = i;
            }
        }
        return index;
    }

}
