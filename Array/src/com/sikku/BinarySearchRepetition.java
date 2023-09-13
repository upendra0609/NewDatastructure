package com.sikku;

public class BinarySearchRepetition {
    public static void main(String[] args) {
        int[] ar = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 6, 6, 7, 7, 8, 9, 9,};
        System.out.println(firstOrLast(ar, 0, true));
        System.out.println(firstOrLast(ar, 2, false));
        System.out.println(firstOrLast(ar, 3, true));
        System.out.println(firstOrLast(ar, 3, false));
        System.out.println(firstOrLast(ar, 7, true));
        System.out.println(firstOrLast(ar, 7, false));
        System.out.println(firstOrLast(ar, 9, true));
        System.out.println(firstOrLast(ar, 9, false));

    }


    //    time complexity is O(n)
    public static void search(int[] ar, int num) {
        int start = 0;
        int end = ar.length - 1;
        int mid = (start + end) / 2;

        int i = 0;
        while (start <= end) {
            if (ar[mid] == num) {
                i = mid;
                end = mid - 1;
            } else if (ar[mid] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }

        int j = i;
        while (i < ar.length && ar[i] == num) {
            i++;
        }
        System.out.println(i - j);
    }

    //    time complexity O(lon n)
    public static int firstOrLast(int[] ar, int num, boolean firstOccurrence) {
        int start = 0;
        int end = ar.length - 1;
        int mid = (start + end) / 2;

        int i = -1;

        while (start <= end) {
            if (ar[mid] == num) {
                i = mid;
                if (firstOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (ar[mid] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return i;
    }
}
