package com.sikku.problem.union;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> i = union(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6,11}, new int[]{1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 7, 8, 10, 10, 10,10,10,11});

        for (int j : i) {
            System.out.print(j + " ");
        }
    }

    public static ArrayList<Integer> union(int[] array1, int[] array2) {
        ArrayList<Integer> unionList = new ArrayList<>();

        int i = 0;
        int j = 0;
        int itemInserted = -1;

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                i++;
            } else if (array2[j] < array1[i]) {
                if (array2[j] != itemInserted) {
                    unionList.add(array2[j]);
                    itemInserted = array2[j];
                }
                j++;
            } else {
                if (array1[i] != itemInserted) {
                    unionList.add(array1[i]);
                    itemInserted = array1[i];
                }
                i++;
            }
        }

        while (i < array1.length) {
            if (array1[i] != itemInserted) {
                unionList.add(array1[i]);
                itemInserted = array1[i];
            }
            i++;
        }
        while (j < array2.length) {
            if (array2[j] != itemInserted) {
                unionList.add(array2[j]);
                itemInserted = array2[j];
            }
            j++;
        }

        return unionList;
    }
}
