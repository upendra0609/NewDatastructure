package com.sikku.searching.minInSortedArray;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 7, 8, 0, 1, 2, 3, 4, 5};
        System.out.println(findMin(array));
    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (nums[low] <= nums[high]) {
                return Math.min(min, nums[low]);
            } else if (nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else if (nums[mid] <= nums[high]) {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
}
