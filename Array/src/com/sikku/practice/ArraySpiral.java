package com.sikku.practice;

public class ArraySpiral {
    public static void main(String[] args) {
        int[][] ar = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//        int[][] ar = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] ar = {{1}, {2}, {3}};
//        int[][] ar = {{1,2,3}};
        spiralRead(ar, ar.length, ar[0].length);
    }

    public static void spiralRead(int[][] ar, int row, int cols) {
        int top = 0;
        int left = 0;
        int bottom = row - 1;
        int right = cols - 1;

        while (bottom >= top && right >= left) {
            //top
            for (int i = left; i <= right; i++) {
                System.out.print(ar[top][i] + " ");
            }
            top++;

            //right
            for (int i = top; i <= bottom; i++) {
                System.out.print(ar[i][right] + " ");
            }
            right--;

            //bottom
            if (bottom >= top) {
                for (int i = right; i >= left; i--) {
                    System.out.print(ar[bottom][i] + " ");
                }
                bottom--;
            }


            //left
            if (right >= left) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(ar[i][left] + " ");
                }
                left++;
            }
        }
    }
}
