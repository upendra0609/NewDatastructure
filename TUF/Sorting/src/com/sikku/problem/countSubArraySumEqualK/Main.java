package com.sikku.problem.countSubArraySumEqualK;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        System.out.println(countSubArray(array, 3));
    }

    public static int countSubArray(int[] array, int k) {
        int low = 0;
        int sum = 0;
        int count = 0;

        //sum, count(number of frequency sum has occurred)
        HashMap<Integer, Integer> map = new HashMap<>();

        //adding 0 comes once in map (1,2) check this case to get reason behind this
        map.put(sum, 1);

        while (low < array.length) {
            sum += array[low];
            low++;
            count += map.getOrDefault((sum - k), 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
