package com.sikku;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[3][3];

        for (int i=0; i<ar.length; i++){
            for (int j=0; j<ar[i].length; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        for (int[] ints : ar) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            System.out.print(sum+" ");
        }
    }
}
