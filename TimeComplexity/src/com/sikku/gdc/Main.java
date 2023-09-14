package com.sikku.gdc;

public class Main {
    public static void main(String[] args) {
//        System.out.println(gdcNonRecursive(20, 100));
    }

    //recursive
    public static int gdc(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }

        if (a <= b) {
            return gdc(b % a, a);
        } else {
            return gdc(a % b, b);
        }
    }

    public static int gdcNonRecursive(int a, int b) {

        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a == 0 ? b : a;
    }
}
