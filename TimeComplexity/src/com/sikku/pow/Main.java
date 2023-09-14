package com.sikku.pow;

public class Main {
    public static void main(String[] args) {
        double x = pow(2, 3);
        System.out.println(x);
    }

    public static double pow(double x, int n) {
        return solve(x , (long) n);
    }

    public static double solve(double x, long n) {
        if (n == 0) return 1;
        if (x == 0) return 0;


        if (n < 0) {
            return solve(1 / x, -n);
        } else {
            if (n % 2 == 0) {
                return solve(x * x, n / 2);
            } else {
                return x * solve(x * x, (n - 1) / 2);
            }
        }
    }
}
