package com.sikku.nextGreaterElementCyclic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        nextGreaterElement(new int[]{1, 2, 1});
    }

    public static int[] nextGreaterElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int n = nums.length;

        int[] ans = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {
            int nextMax = -1;
            int newIndex = i % n;
            while (!stack.isEmpty() && stack.peek() <= nums[newIndex]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nextMax = stack.peek();
            }
            stack.push(nums[newIndex]);
            ans[newIndex] = nextMax;
        }

        return ans;
    }
}
