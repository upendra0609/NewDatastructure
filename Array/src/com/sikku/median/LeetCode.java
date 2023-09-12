package com.sikku.median;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        //insuring first array is smaller in size
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0;
        int high = n1;
        int mid1 = (low + high) / 2;

        int mid2 = 0;

        int totalEle = (n1 + n2);

        while (low <= high) {

            mid2 = (totalEle/2) - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;


            if (mid1 < nums1.length) {
                r1 = nums1[mid1];
            }
            if (mid2 < nums2.length) {
                r2 = nums2[mid2];
            }
            if (mid2 > 0) {
                l2 = nums2[mid2 - 1];
            }
            if (mid1 > 0) {
                l1 = nums1[mid1 - 1];
            }

            //checking if right condition
            if (l1 > r2) {
                high = mid1 - 1;
            } else if (l2 > r1) {
                low = mid1 + 1;
            } else {
//                System.out.println(l1 + " " + l2);
//                System.out.println(r1 + " " + r2);
                int min = min(r1, r2);
                int max = max(l1, l2);

                double result = 0;
                if (totalEle % 2 == 0) {
                    result = (double) (min + max) / 2.0;
                } else {
                    result = min;
                }
                return result;
            }
            mid1 = (low + high) / 2;
        }
        return 0;

    }

    public static int min(int i, int j) {
        return Math.min(i, j);
    }

    public static int max(int i, int j) {
        return Math.max(i, j);
    }
}
