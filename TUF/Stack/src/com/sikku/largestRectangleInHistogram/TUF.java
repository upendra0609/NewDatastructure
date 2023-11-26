package com.sikku.largestRectangleInHistogram;

import java.util.Stack;

public class TUF {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];

        for (int i = 0; i < n; i++) {
            int index = i;
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                index = stack.pop();
                if (!stack.isEmpty()) {
                    index = stack.peek() + 1;
                }
            }
            if (stack.isEmpty()) {
                index = 0;
            }
            stack.push(i);
            leftMin[i] = index;
        }

        stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int index = i;

            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                index = stack.pop();
                if (!stack.isEmpty()) {
                    index = stack.peek() - 1;
                }
            }
            if (stack.isEmpty()) {
                index = n - 1;
            }
            stack.push(i);
            rightMin[i] = index;
        }

//        for (int i : rightMin) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//        for (int i : leftMin) {
//            System.out.print(i + " ");
//        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int res = Math.abs(rightMin[i] - leftMin[i]) + 1;
            res *= nums[i];
            max = Math.max(max, res);
        }
        return max;
    }
}
