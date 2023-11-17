package com.sikku.problem.threeSum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
//        Set<List<Integer>> res = better(array);
        List<List<Integer>> res = optimal(array);

        for (List<Integer> l : res) {
            for (int i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //for brute force solution use three loop

    public static Set<List<Integer>> better(int[] array) {
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            Set<Integer> Hash = new HashSet<>();
            for (int j = i + 1; j < array.length; j++) {
                int k = -(array[i] + array[j]);
                if (Hash.contains(k)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(array[i]);
                    list.add(array[j]);
                    list.add(k);
                    list.sort(Comparable::compareTo);
                    result.add(list);
                }
                Hash.add(array[j]);
            }
        }

        return result;
    }


//    optimise more by checking repeating element
    public static List<List<Integer>> optimal(int[] array) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(array);
        int n = array.length - 1;
        int i = 0;
        int j = i + 1;
        int k = n;

        while (i < n - 1) {
            while (j < k) {
                int temp = array[i] + array[j] + array[k];
                if (temp < 0) {
                    j++;
                } else if (temp > 0) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(array[i]);
                    list.add(array[j]);
                    list.add(array[k]);
                    result.add(list);
                    j++;
                    k--;
                }
            }
            int varI = array[i];
            while (array[i] == varI && i < n - 1) i++;
            j = i + 1;
            k = n;
        }

        return new ArrayList<>(result);
    }
}
