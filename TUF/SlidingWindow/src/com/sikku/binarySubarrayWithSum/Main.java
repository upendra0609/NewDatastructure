package com.sikku.binarySubarrayWithSum;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }

    public int subArrayWithSumUsingPrefixSum(int[] nums, int goal) {
        HashMap<Integer, Integer> hash = new HashMap<>();


        int n = nums.length;
        int sum = 0;
        hash.put(sum, 1);
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (hash.containsKey(sum - goal)) {
                count += hash.get(sum - goal);
            }
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }
        return count;
    }


    public int numSubArraysWithSumSlidingWindow(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }

    private int atMost(int[] nums, int goal){
        int right =0;
        int left =0;
        int n = nums.length;
        int sum =0;

        int atMost = 0;

        while(right<n){
            sum += nums[right];
            while(left<=right && sum>goal){
                sum -= nums[left];
                left++;
            }
            atMost += (right - left + 1);
            right++;
        }
        return atMost;
    }
}
