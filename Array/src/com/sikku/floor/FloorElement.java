package com.sikku.floor;

public class FloorElement {
    public static void main(String[] args) {
        int[] ar = {-13, -5, -2, 3, 5, 7, 10, 16, 18, 20};
        int[] q = {18, 5, 19, -34, 0, -1, -10, 25};
//        floorLinear(ar, q);

        ceilBinary(ar,1);
        ceilBinary(ar,21);
        ceilBinary(ar,-1);
        ceilBinary(ar,7);
        ceilBinary(ar,16);
    }

    public static void floorLinear(int[] ar, int[] queryArray) {
        for (int j : queryArray) {
            int floor = Integer.MIN_VALUE;
            for (int i : ar) {
                if (i > floor && i <= j) {
                    floor = i;
                }
            }
            System.out.println(floor);
        }
    }

    public static void floorBinary(int[] ar, int num) {
        int floor = Integer.MIN_VALUE;
        int start = 0;
        int end = ar.length - 1;
        int mid = (end + start) / 2;

        while (start <= end) {
            if (ar[mid] <= num) {
                floor = ar[mid];
                start = mid + 1;
            } else if (ar[mid] > num) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println(floor);
    }

    public static void ceilBinary(int[] ar, int num) {
        int floor = Integer.MAX_VALUE;
        int start = 0;
        int end = ar.length - 1;
        int mid = (end + start) / 2;

        while (start <= end) {
            if (ar[mid] < num) {
                start = mid + 1;
            } else if (ar[mid] >= num) {
                floor = ar[mid];
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println(floor);
    }
}
