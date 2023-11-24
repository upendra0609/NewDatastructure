package com.sikku.sumOfSubArrayMinimum;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int[]{11,81,94,43,3}));
    }
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Pair> left = new Stack<>();
        Stack<Pair> right = new Stack<>();

        int[] leftArr = new int[n];
        int[] rightArr = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (left.size() > 0 && left.peek().value > arr[i]) {
                count += left.pop().count;
            }
            left.push(new Pair(arr[i], count));
            leftArr[i] = count;

            count = 1;
            while (right.size() > 0 && right.peek().value > arr[n - i - 1]) {
                count += right.pop().count;
            }
            right.push(new Pair(arr[n - i - 1], count));
            rightArr[n - i - 1] = count;
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += (leftArr[i] * rightArr[i] * arr[i]);
        }

        return result;
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
