package com.sikku.Practice1;

public class SubArray {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        printSubArray(array);
    }

    public static void printSubArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
//                for (int k = i; k <= j; k++) {
                    System.out.print(array[j]+" ");
//                }
                System.out.println();
            }
        }
    }

}
