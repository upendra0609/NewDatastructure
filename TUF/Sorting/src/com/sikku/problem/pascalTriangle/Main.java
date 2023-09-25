package com.sikku.problem.pascalTriangle;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        System.out.println(printParticularElement(n - 1, r - 1));
    }

    public static long printParticularElement(int n, int c) {
        long result = 1;

        for (int i = 0; i < c; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }
}
