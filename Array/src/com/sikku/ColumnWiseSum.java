package com.sikku;

import java.util.Scanner;

public class ColumnWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=2;
        int m=3;
        int[][] ar = new int [n][m];


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += ar[j][i];
            }
            System.out.print(sum + " ");
        }
    }
}
