package com.sikku.problem.leaderInArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> leader = leader(array);

        for (int i: leader){
            System.out.print(i+" ");
        }
    }

    public static ArrayList<Integer> leader(int[] array) {
        ArrayList<Integer> leader = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                leader.add(array[i]);
                max = array[i];
            }
        }

        return leader;
    }
}
