package com.sikku.powerSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> l = powerSet(new int[]{1,2,3,4});

        for(List<Integer> i : l){
            System.out.println(i);
        }
    }

    public static List<List<Integer>> powerSet(int[] array) {
        int n = array.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++) {
            int tempI = i;
            int count = 0;
            List<Integer> temp = new ArrayList<>();
            while (tempI != 0) {
                if ((tempI & (1)) != 0) {
                    temp.add(array[count]);
                }
                count++;
                tempI >>= 1;
            }
            ans.add(temp);
        }
        return ans;
    }
}
