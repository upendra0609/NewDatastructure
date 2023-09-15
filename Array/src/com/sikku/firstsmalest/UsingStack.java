package com.sikku.firstsmalest;

import java.util.Stack;

public class UsingStack {
    public static void main(String[] args) {
//        int[] array = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        int[] array = {2, 10, 12, 1, 11};
        nextGreater(array, array.length);
    }

    public static void nextGreater(int[] array, int size) {
        Stack<Integer> stack = new Stack<>();

        for (int i = size - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= array[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(stack.peek() + " ");
                }
                stack.push(array[i]);
            } else {
                stack.push(array[i]);
                System.out.print(-1 + " ");
            }
        }
    }
}
