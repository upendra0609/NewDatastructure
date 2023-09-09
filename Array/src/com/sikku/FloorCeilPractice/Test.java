package com.sikku.FloorCeilPractice;

public class Test {
    public static void main(String[] args) {
        System.out.println(ceil(new int[]{1,  3, 4, 5, 6, 7}, 1));
        System.out.println(ceil(new int[]{1, 2,  4, 5, 6, 7}, 3));
        System.out.println(ceil(new int[]{1, 2, 3, 4, 5, 6, 7}, 4));
        System.out.println(ceil(new int[]{1, 2, 3, 4, 5,  7}, 6));
        System.out.println(ceil(new int[]{1, 2, 3, 4, 6, 7}, 9));
    }

    public static int floor(int[] ar, int num) {
        int result = Integer.MIN_VALUE;
        int start = 0;
        int end = ar.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (ar[mid] <= num) {
                result = ar[mid];
                start = mid + 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return result;
    }

    public static int ceil(int[] ar, int num) {
        int result = Integer.MAX_VALUE;
        int start = 0;
        int end = ar.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if(ar[mid]>=num){
                result = ar[mid];
                end = mid-1;
            }else {
                start = mid +1;
            }
            mid = (start+end)/2;
        }

        return result;
    }
}
