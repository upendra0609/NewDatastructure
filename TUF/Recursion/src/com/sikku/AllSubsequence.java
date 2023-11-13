package com.sikku;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequence {
    public static void main(String[] args) {
        List<List<Integer>> list = subsequence(new int[]{1, 2, 3, 1, 1});
        for (List<Integer> i : list) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> subsequence(int[] array) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    list.add(array[k]);
                }
                result.add(list);
            }
        }
        return result;
    }

    public static List<List<Integer>> recursiveSubsequence(int[] array) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    list.add(array[k]);
                }
                result.add(list);
            }
        }
        return result;
    }

}
