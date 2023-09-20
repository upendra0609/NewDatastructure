package com.sikku.problem.intersection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 3, 4, 5, 6, 6};
        int[] array2 = {3, 3, 4, 5, 6, 6, 7, 8, 9};

        ArrayList<Integer> list = intersection(array1, array2);

        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> intersection(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < size1 && j < size2) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array1[i]) {
                j++;
            } else {
                list.add(array1[i]);
                i++;
                j++;
            }
        }
        return list;
    }
}
