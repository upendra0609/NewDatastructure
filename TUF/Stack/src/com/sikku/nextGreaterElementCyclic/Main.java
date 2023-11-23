package com.sikku.nextGreaterElementCyclic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        nextGreaterElement(new int[]{2, 10, 12, 1, 11});
    }

    public static void nextGreaterElement(int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums2.length;

        for (int i = 2 * n - 1; i >= n-1; i--) {
            int nextMax = -1;
            int newIndex = i % n;
            while (!stack.isEmpty() && stack.peek() < nums2[newIndex]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nextMax = stack.peek();
            }
            stack.push(nums2[newIndex]);
            map.put(nums2[newIndex], nextMax);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> i : entrySet) {
            System.out.println(i.getKey() + "  " + i.getValue());
        }
    }
}
