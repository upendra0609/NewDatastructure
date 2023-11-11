package com.sikku;

public class Pow {
    public static void main(String[] args) {
        System.out.println(power(5, 25));
    }

    public static double pow(double x, int n) {
        if (n == 0) return 1;

        return x * pow(x, n - 1);
    }

    public static double power(double x, long n) {
        if (n == 0) return 1;

        if (n < 0) {
            return power(1 / x, -n);
        }

        if (n % 2 == 0) {
            return power(x * x, n / 2)  %1000000007;
        } else {
            return (x * power(x * x, (n - 1) / 2) ) %1000000007;
        }
    }
}
