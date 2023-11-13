package com.sikku.setBit;

public class Main {
    public static void main(String[] args) {
        System.out.println(setBit1(84));
    }

    public static int setBit(int n) {
        int count = 0;
        while (n != 0) {
            int bit = 1 & n;
            if (bit == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static int setBit1(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
