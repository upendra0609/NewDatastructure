package com.sikku.sumpair;

public class SumOfPairThree {
    public static void main(String[] args) {
        isPresent(new int[]{1,2,3,4,5,6,7,9}, 233);

    }

    public static void isPresent(int[] ar, int num) {
        int a = 0, b = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                a = num - (ar[i] + ar[j]);
                if (binarySearch(ar, j + 1, a)) {
                    System.out.println(ar[i] + " " + ar[j] + " " + a);
//                    return;
                }
            }
        }
    }

    public static boolean binarySearch(int[] ar, int start, int num) {
//        int start = 0;
        int end = ar.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (ar[mid] == num) {
                return true;
            } else if (ar[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return false;
    }
}
