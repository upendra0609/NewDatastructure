package com.sikku.largestRectangleInHistogram;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3,1}));
    }
    public static int largestRectangleArea(int[] nums) {

        int n = nums.length;


        Stack<Pair> minLeftStack = new Stack<>();
        Stack<Pair> minRightStack = new Stack<>();

        int[] minLeftArr = new int[n];
        int[] minRightArr = new int[n];


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
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = minRightArr[i] + minLeftArr[i] - 1;
            x *= nums[i];

            ans = Math.max(x, ans);
        }

        return ans;


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
