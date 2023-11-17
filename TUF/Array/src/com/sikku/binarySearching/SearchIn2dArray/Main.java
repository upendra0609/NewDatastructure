package com.sikku.binarySearching.SearchIn2dArray;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{3, 4, 7, 9},
                {12, 13, 16, 18},
                {20, 21, 23, 29}
        };
        System.out.println(better(array, 22));
    }

    public static boolean brute(int[][] array, int target) {
        int m = array.length;

        for (int i = 0; i < m; i++) {
            int n = array[i].length;
            for (int j = 0; j < n; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean better(int[][] array, int target) {
        int m = array.length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            int low = 0;
            int high = array[i].length - 1;
            if (target >= array[i][low] && target <= array[i][high]) {
                while (low <= high) {
                    count++;
                    int mid = (low + high) / 2;
                    if (array[i][mid] == target) {
                        System.out.println(count);
                        return true;
                    } else if (target > array[i][mid]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }
        System.out.println(count);
        return false;
    }

    public static boolean optimal(int[][] array, int target) {
        int m = array.length;
        int n = array[0].length;
        int low = 0;
        int high = m * n - 1;   //constraints array is having at least 1 row
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / n;
            int col = mid % n;
            if(array[row][col]==target){
                return true;
            } else if (array[row][col]>target) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return false;
    }
}
