package com.sikku.firstsmalest;

import java.util.Stack;

public class UsingStack {
    public static void main(String[] args) {
        int[] array = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
//        int[] array = {2,2,2,2,2,2};
        nextGreater(array, array.length);
    }

    //without cyclic
    public static void nextGreater(int[] array, int size) {
        int[] nge = new int[size];
        Stack<Integer> stack = new Stack<>();
        for (int i = size - 1; i >= 0; i--) {
//            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= array[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    nge[i] = -1;
//                    System.out.print(-1 + " ");
                } else {
                    nge[i] = stack.peek();
//                    System.out.print(stack.peek() + " ");
                }
                stack.push(array[i]);
//            } else {
//                stack.push(array[i]);
//                System.out.print(-1 + " ");
//            }
        }

        for (int i: nge){
            System.out.print(i+" ");
        }
    }
}
