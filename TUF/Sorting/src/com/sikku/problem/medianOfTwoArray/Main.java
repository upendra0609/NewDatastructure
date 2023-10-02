package com.sikku.problem.medianOfTwoArray;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {7, 8, 12, 14, 15};
        int[] array2 = {1, 2, 3, 4, 9, 11};
        median(array1, array2);

    }

    public static void median(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;

        if (n2 < n1) median(array2, array1);

        int low = 0;
        int high = n1;
        int mid1 = (low + high) / 2;
        int mid2 = (n1 + n2) / 2 - mid1;

        while (low <= mid1 && high >= mid1) {
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            if (mid1 > 0) {
                l1 = array1[mid1 - 1];
            }
            if (mid1 < n1) {
                r1 = array1[mid1];
            }


            if (mid2 > 0) {
                l2 = array2[mid2 - 1];
            }
            if (mid2 < n2) {
                r2 = array2[mid2];
            }

            if (l1 > r2) {
                high = mid1 - 1;
            } else if (l2 > r1) {
                low = mid1 + 1;
            } else {
//                float res = (float)(Math.min(r1, r2) + Math.max(l1, l2)) / 2;

                System.out.println(Math.min(r1, r2));
                break;
            }
            mid1 = (low + high) / 2;
            mid2 = (n1 + n2) / 2 - mid1;
        }
    }
}
