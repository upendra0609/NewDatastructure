package com.sikku.MaximalRectangle;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int ar = twoDtoOneD(new int[][]{
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}
        });

        System.out.println(ar);

        ar = twoDtoOneD(new int[][]{
                {1}
        });

        System.out.println(ar);

        ar = twoDtoOneD(new int[][]{
                {0}
        });

        System.out.println(ar);
    }

    public static int twoDtoOneD(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[] tempArray = new int[n];
        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    tempArray[j] += arr[i][j];
                } else {
                    tempArray[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(tempArray));
        }
        return maxArea;
    }

    public static int largestRectangleArea(int[] nums) {
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
