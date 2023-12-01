package com.sikku.maximumConsecutiveOnes;

import javax.swing.plaf.IconUIResource;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveBetter(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(maxConsecutiveBetter(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    public static int maxConsecutive(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;

        for (var i = 0; i < n; i++) {
            int count = 0;
            int zero = 0;
            for (var j = i; j < n; j++) {
                if (arr[j] == 0 && zero < k) {
                    zero++;
                    count++;
                } else if (arr[j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            maxLength = Math.max(maxLength, count);
        }
        return maxLength;
    }

    public static int maxConsecutiveBetter(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        int zero = 0;
        int right = 0;
        int left = 0;

        while (right < n) {
            if (arr[right] == 0 && zero < k) {
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
                zero++;
            } else if (arr[right] == 1) {
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                while (arr[left] != 0) {
                    left++;
                }
                left++;
                zero--;
            }
        }
        return maxLength;
    }
}
