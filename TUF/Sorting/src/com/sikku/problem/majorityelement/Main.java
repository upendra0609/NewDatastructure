package com.sikku.problem.majorityelement;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,1,2,0,0,0,0};
        System.out.println(majority(array));
    }

    public static int majorityElement(int[] nums) {
        int n = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (n == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    n = nums[i + 1];
                }
            }
        }

        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n == nums[i]) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return n;
        }
        return -1;
    }

    public static int majority(int[] nums) {
        int n = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0 && n!=nums[i]){
                n= nums[i];
                count = 1;
            }else if(n==nums[i]){
                count ++;
            }else{
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n == nums[i]) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return n;
        }
        return -1;
    }
}