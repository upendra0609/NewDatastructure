package com.sikku.lcm;

public class OptimizeSoln {
    public static void main(String[] args) {
        System.out.println(lcm(2,8));
    }

    public static int lcm(int a, int b) {
        return (a * b) / gdc(a, b);
    }

    public static int gdc(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }

        if (a >= b) {
            return gdc(a % b, b);
        } else {
            return gdc(b % a, a);
        }
    }
}
