package com.sikku.sumOfSubArrayRange;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public long subArrayRanges(int[] nums) {
        int n = nums.length;


        Stack<Pair> minLeftStack = new Stack<>();
        Stack<Pair> minRightStack = new Stack<>();
        Stack<Pair> maxLeftStack = new Stack<>();
        Stack<Pair> maxRightStack = new Stack<>();

        int[] minLeftArr = new int[n];
        int[] minRightArr = new int[n];
        int[] maxLeftArr = new int[n];
        int[] maxRightArr = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!minLeftStack.isEmpty() && minLeftStack.peek().value > nums[i]) {
                count += minLeftStack.pop().count;
            }
            minLeftStack.push(new Pair(nums[i], count));
            minLeftArr[i] = count;

            count = 1;
            while (!minRightStack.isEmpty() && minRightStack.peek().value >= nums[n - i - 1]) {
                count += minRightStack.pop().count;
            }
            minRightStack.push(new Pair(nums[n - i - 1], count));
            minRightArr[n - i - 1] = count;


            count = 1;
            while (!maxLeftStack.isEmpty() && maxLeftStack.peek().value < nums[i]) {
                count += maxLeftStack.pop().count;
            }
            maxLeftStack.push(new Pair(nums[i], count));
            maxLeftArr[i] = count;

            count = 1;
            while (!maxRightStack.isEmpty() && maxRightStack.peek().value <= nums[n - i - 1]) {
                count += maxRightStack.pop().count;
            }
            maxRightStack.push(new Pair(nums[n - i - 1], count));
            maxRightArr[n - i - 1] = count;
        }


        long max = 0;
        long min = 0;

        for (int i = 0; i < n; i++) {
            min += ((long) nums[i] * minLeftArr[i] * minRightArr[i]);

            max += ((long) nums[i] * maxLeftArr[i] * maxRightArr[i]);
        }

        return max - min;


    }
}

class Pair {
    int value;
    int count;

    public Pair(int value, int count) {
        this.value = value;
        this.count = count;
    }
}