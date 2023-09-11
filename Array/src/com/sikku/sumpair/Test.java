package com.sikku.sumpair;

public class Test {
    public static void main(String[] args) {
//        sumOfPairs(new int[]{3, 10, -4, 15, -9, 20, 12, 25}, 35);

        System.out.println(sumOfPairBinary(new int[]{1, 2, 4, 5, 7, 10, 25}, 6));
        System.out.println(sumOfPairBinary(new int[]{1, 2, 4, 5, 7, 10, 25}, 10));
        System.out.println(sumOfPairBinary(new int[]{1, 2, 4, 5, 7, 10, 25}, 35));

    }

    public static void sumOfPairs(int[] ar, int num) {

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) == num) {
                    System.out.println("ar[" + i + "] + ar[" + j + "] = " + num);
                    return;
                }
            }
        }
        System.out.println("no two number are having sum of " + num);
    }

    public static boolean sumOfPairBinary(int[] ar, int num) {
        int size = ar.length;
        for (int i = 0; i < size; i++) {
            int a = num - ar[i];
            if (isPresent(ar,i+1, a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPresent(int[] ar,int start, int num) {
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
