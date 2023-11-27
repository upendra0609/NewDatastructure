package com.sikku.countNextGreaterElement;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] ar = countGreater(new int[]{1, 3, 6, 5, 8, 9, 13, 4}, new int[]{0, 1, 5});
        for (int i : ar) {
            System.out.print(i + "  ");
        }
    }

    public static int[] countGreater(int[] arr, int[] query) {
        Stack<Pair> stack = new Stack<>();


        int n = arr.length;
        int[] temp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            if (!stack.isEmpty() && stack.peek().value > arr[i]) {
                count = (stack.pop().count + 1);
            }
            stack.push(new Pair(arr[i], count));
            temp[i] = count;
        }


        int[] result = new int[query.length];

        for (int i = 0; i < query.length; i++) {
            result[i] = temp[query[i]];
        }
        return result;
    }
}

class Pair {
    int count;
    int value;

    public Pair(int value, int count) {
        this.count = count;
        this.value = value;
    }
}
