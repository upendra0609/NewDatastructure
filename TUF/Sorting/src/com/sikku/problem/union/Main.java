package com.sikku.problem.union;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> i = union(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1,2,3,4,5,5,5,5,5, 5, 7, 8, 9, 10, 10, 10, 10});

        for (int j : i) {
            System.out.print(j + " ");
        }
    }

    public static ArrayList<Integer> union(int[] array1, int[] array2) {
        ArrayList<Integer> unionList = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                i++;
            } else if (array1[i] < array2[j]) {
                unionList.add(array1[i]);
                i++;
            } else {
                unionList.add(array2[j]);
                j++;
            }
        }

        while (i < array1.length) {
            if (array1[i - 1] != array1[i]) {
                unionList.add(array1[i]);
            }
            i++;
        }

        while (j < array2.length) {
            if (array2[j] != array2[j - 1]) {
                unionList.add(array2[j]);
            }
            j++;
        }

        return unionList;
    }
}
