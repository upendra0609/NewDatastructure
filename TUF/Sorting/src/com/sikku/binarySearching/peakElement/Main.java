package com.sikku.binarySearching.peakElement;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(peakElement(array));
    }

    public static int peakElement(int[] nums) {
        int n = nums.length - 1;
        int low = 0;
        int high = n;
        if (nums.length == 1) return 0;
        if (nums[low] > nums[low + 1]) return low;
        if (nums[high] > nums[high - 1]) return high;

        low++;
        high--;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            } else if (nums[mid] > nums[mid + 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;    //when all case failed eliminate either left or right  ex. {1,5,1,2,1}
            }
        }
        return -1;
    }
}
