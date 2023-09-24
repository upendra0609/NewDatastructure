package com.sikku.problem.spiralTraversal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        int[][] array = {{1,2,3}};
        spiralTraversal(array);

//        for (int i[]: array){
//            for (int j: i){
//                System.out.print(j+" ");
//            }
//        }
    }

    public static List<Integer> spiralTraversal(int[][] array) {
        int top = 0;
        int left = 0;
        int right = array[0].length - 1;
        int bottom = array.length - 1;
        List<Integer> list = new ArrayList<>();

        while (top <= bottom && left <= right) {
            //left - right
            for (int i = left; i <= right; i++) {
//                System.out.print(array[top][i] + " ");
                list.add(array[top][i]);
            }
            top++;

            //top - bottom
            for (int i = top; i <= bottom; i++) {
//                System.out.print(array[i][right] + " ");
                list.add(array[i][right]);
            }
            right--;

//            right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
//                    System.out.print(array[bottom][i] + " ");
                    list.add(array[bottom][i]);
                }
            }
            bottom--;

            //bottom to top
            if (right >= left) {
                for (int i = bottom; i >= top; i--) {
//                    System.out.print(array[i][left] + " ");
                    list.add(array[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}
