package com.sikku.nextGreaterElement;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        nextGreaterElement(new int[]{3, 10, 4, 2, 6, 1, 7, 9});
    }

    public static void nextGreaterElement(int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums2.length;

        for (int i = n - 1; i >= 0; i--) {
            int nextMax = -1;
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nextMax = stack.peek();
            }
            stack.push(nums2[i]);
            map.put(nums2[i], nextMax);
        }


        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> i : entrySet) {
            System.out.println(i.getKey() + "  " + i.getValue());
        }
    }
}
