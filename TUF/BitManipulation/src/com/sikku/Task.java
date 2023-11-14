package com.sikku;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(1000);
        l1.add(2000);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1000);
        l2.add(0);
        l2.add(2000);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(0);
        l3.add(1000);
        l3.add(0);

        list.add(l1);
        list.add(l2);
        list.add(l3);

        int n =minCashFlow(list,3);
        System.out.println(n);

    }
    public static int minCashFlow(ArrayList<ArrayList<Integer>> money, int n) {
        int[][] arr = new int[n][n];

        int j = 0;
        for (ArrayList<Integer> l : money) {
            for (int i = 0; i < n; i++) {
                arr[j][i] = (int) l.get(i);
            }
            j++;
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                int val = Math.abs(arr[i][j] - arr[j][i]);
                result += val;
            }
        }
        return result;


    }
}
