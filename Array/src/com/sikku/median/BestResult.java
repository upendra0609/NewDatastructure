package com.sikku.median;

public class BestResult {
    public static void main(String[] args) {
        double x = findMedian(new int[]{1, 2}, new int[]{3,4});
        System.out.println(x);
    }

    public static double findMedian(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;

        //insuring first array is smaller in size
        if (n1 > n2) {
            return findMedian(array2, array1);
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


            if (mid1 < array1.length) {
                r1 = array1[mid1];
            }
            if (mid2 < array2.length) {
                r2 = array2[mid2];
            }
            if (mid2 > 0) {
                l2 = array2[mid2 - 1];
            }
            if (mid1 > 0) {
                l1 = array1[mid1 - 1];
            }

            if (l1 > r2) {
                high = mid1 - 1;
            } else if (l2 > r1) {
                low = mid1 + 1;
            } else {
//                System.out.println(l1 + " " + l2);
//                System.out.println(r1 + " " + r2);
                int min = Math.min(r1, r2);
                int max = Math.max(l1, l2);

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
}
