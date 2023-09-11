package com.sikku;

public class pattern {
    public static void main(String[] args) {
//        int n = 7;
        pattern(3);


//        for (int i = 0; i < n; i++) {
//            System.out.print("*" + " ");
//            if (i == 0 || i == n - 1) {
//                for (int j = n - i - 1; j > 0; j--) {
//                    System.out.print("*" + " ");
//                }
//            } else {
//                //space
//                for (int j = n - i - 2; j > 0; j--) {
//                    System.out.print(" " + " ");
//                }
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
    }

    public static void pattern(int n) {
        int num = n;
        int start = 0;
        int end = 2 * n - 2;

        int[][] ar = new int[2 * n - 1][2 * n - 1];

        while (start<=end) {
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i == start || i == end || j == start || j == end) {
                        ar[i][j] = n;
                    }
                }
            }
            start ++;
            end--;
            n--;
        }


        for (int[] i : ar) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
