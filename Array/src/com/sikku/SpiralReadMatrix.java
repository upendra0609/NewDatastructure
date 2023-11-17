package com.sikku;

public class SpiralReadMatrix {
    public static void main(String[] args) {
        int[][] ar = {{1},
                      {2},
                      {3}
        };

        read(ar, ar.length, ar[0].length);
    }

    public static void read(int[][] ar, int m, int n) {
        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;

        while (bottom >= top && right >= left) {
            //top (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(ar[top][i] + " ");
            }
            top++;

            //right (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(ar[i][right] + " ");
            }
            right--;

            //bottom (right to left) check for 1x3
            if (bottom >= top) {
                for (int i = right; i >= left; i--) {
                    System.out.print(ar[bottom][i] + " ");
                }
                bottom--;
            }

            //left (bottom to top) check for 3x1
            if (right >= left) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(ar[i][left] + " ");
                }
                left++;
            }
        }

    }
}
