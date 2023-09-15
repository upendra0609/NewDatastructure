package com.sikku.divisors.array;

public class BinarySearching2dArray {
    public static void main(String[] args) {
      search(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {65, 68, 69, 72}, {81, 84, 89, 96}}, 100);

    }

    public static boolean search(int[][] ar, int num) {
        int m = ar.length;
        int n = ar[0].length;

        int low = 0;
        int high = m - 1;

        int i = n - 1;

        int mid = (low + high) / 2;


        //searching row
        while (low <= high) {
            if (ar[mid][i] == num) {
                return true;
            } else if (ar[mid][i] < num) {
                low = mid + 1;
            } else if (ar[mid][i] > num) {
                if (mid != 0 && ar[mid - 1][i] < num) {
                    break;
                } else {
                    high = mid - 1;
                }
            }
            mid = (low + high) / 2;
        }

        i = mid;
        low = 0;
        high = n - 1;
        mid = (low + high) / 2;

        //searching for column
        while (low <= high) {
            if (ar[i][mid] == num) {
                return true;
            } else if (ar[i][mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }

        return false;
    }
}
