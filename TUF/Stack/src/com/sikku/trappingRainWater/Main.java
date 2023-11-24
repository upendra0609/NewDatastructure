package com.sikku.trappingRainWater;

public class Main {

    public static int trap(int[] height) {
        int maxIndex = maxIndex(height);
        int n = height.length;

        int trappedWater = 0;

        int max = 0;
        for (int i = 0; i < maxIndex; i++) {
            int water = max - height[i];
            if (water >= 0) {
                trappedWater += water;
            }
            if (height[i] > max) {
                max = height[i];
            }
        }

        max = 0;
        for (int i = n - 1; i >= maxIndex; i--) {
            int water = max - height[i];
            if (water >= 0) {
                trappedWater += water;
            }
            if (height[i] > max) {
                max = height[i];
            }
        }

        return trappedWater;

    }

    private static int maxIndex(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
