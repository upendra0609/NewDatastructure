package com.sikku.asteroidcollision;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = asteroidCollision(new int[]{-2, -2, -1, -2});
        int[] arr2 = asteroidCollision(new int[]{5, 10, -5});
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        int n = asteroids.length;

        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() < Math.abs(asteroids[i]) && stack.peek() > 0) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i]) && stack.peek() > 0) {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() > Math.abs(asteroids[i]) && stack.peek() > 0) {

                } else {
                    stack.push(asteroids[i]);
                }
            }
        }

        int m = stack.size();

        int[] result = new int[m];
        int index = 0;
        for (int i : stack) {
            result[index] = i;
            index++;
        }
        return result;
    }

}
