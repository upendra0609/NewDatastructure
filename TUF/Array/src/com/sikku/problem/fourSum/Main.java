package com.sikku.problem.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1000000000, 1000000000, 1000000000, 1000000000};
        optimal(array, -294967296);
    }


    public static List<List<Integer>> better(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();

        int n = array.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                HashSet<Integer> hash = new HashSet<>();
                for (int k = j + 1; k < n - 1; k++) {
                    int fourth = target - (array[i] + array[j] + array[k]);
                    if (hash.contains(fourth)) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(array[i]);
                        list.add(array[j]);
                        list.add(array[k]);
                        list.add(fourth);
                        list.sort(Integer::compare);
                        if (!result.contains(list)) {
                            result.add(list);
                        }
                    }
                    hash.add(array[k]);
                }
            }
        }
//        for (ArrayList<Integer> l: answer){
//            System.out.println(l);
//        }
        return result;
    }


    public static List<List<Integer>> optimal(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
//                    int temp = nums[k];
//                    while (k < l && temp == nums[k + 1]) {
//                        k++;
//                    }
//                    int temp1 = nums[l];
//                    while (k < l && temp1 == nums[l - 1]) {
//                        l--;
//                    }
                    long res = nums[i];
                    res += nums[j];
                    res += nums[k];
                    res += nums[l];
                    if (res > target) {
                        l--;
                    } else if (res < target) {
                        k++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        result.add(list);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }
                }
//                int temp = nums[j];
//                while (j < n - 1 && temp == nums[j + 1]) {
//                    j++;
//                }
            }
//            int temp = nums[i];
//            while (i < n - 1 && temp == nums[i + 1]) {
//                i++;
//            }
        }


        for (List<Integer> l : result) {
            System.out.println(l);
        }


        return result;
    }
}
