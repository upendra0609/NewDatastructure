package com.sikku.problem.NcR;

public class Main {
    public static void main(String[] args) {
        System.out.println(nCr(10, 3));
    }

    public static long nCr(int n, int r) {
        long ans = 1;
        int i = 1;

        while (r > 0) {
            ans *= n--;
            ans /= i++;

            r--;
        }
        return ans;
    }
}
