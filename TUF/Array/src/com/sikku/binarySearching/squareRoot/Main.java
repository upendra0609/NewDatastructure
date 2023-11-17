package com.sikku.binarySearching.squareRoot;

public class Main {
    public static void main(String[] args) {
        System.out.println(root(26));
        System.out.println(root(25));
        System.out.println(root(46));
        System.out.println(root(66));
        System.out.println(root(0));
        System.out.println(root(1));
    }

    //optimal
    public static int root(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (mid * mid <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
