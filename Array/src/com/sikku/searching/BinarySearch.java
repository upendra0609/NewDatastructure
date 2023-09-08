package com.sikku.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int index = search(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8);
        System.out.println(index);
    }

    public static int search(int[] ar, int num) {
        int start = 0;
        int end = ar.length - 1;
        int mid = (start + end) / 2;

        int index = -1;

        while (start <= end) {
            if (num == ar[mid]) {
                return mid;
            } else if (num > ar[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (end + start) / 2;
        }
        return index;
    }

}
