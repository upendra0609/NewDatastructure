package com.sikku.slidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        System.out.println(maxSlidingWindow(new int[]{1}, 1));
    }

    public static int maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && arr[queue.peekLast()] <= arr[i]) {
                queue.pollLast();
            }
            queue.addLast(i);

            if ((i - k + 1) >= 0) {
                while (!queue.isEmpty() && queue.peekFirst() <= (i - k)) {
                    queue.pollFirst();
                }
                max = Math.max(max, arr[queue.getFirst()]);
            }
        }

        return max;
    }
}
