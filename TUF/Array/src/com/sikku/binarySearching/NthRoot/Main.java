package com.sikku.binarySearching.NthRoot;

public class Main {
    public static void main(String[] args) {
        System.out.println(nThRoot(3,27));
        System.out.println(nThRoot(4,69));
        System.out.println(nThRoot(2, 36));
        System.out.println(nThRoot(4,79));
    }

    public static int nThRoot(int n, int num) {
        int low = 1;
        int high = num;

        while (low <= high) {
            int mid = (low + high) / 2;
            int pow = (int) Math.pow(mid, n);
            if (pow == num) {
                return mid;
            } else if (pow > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
