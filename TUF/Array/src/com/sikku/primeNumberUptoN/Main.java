package com.sikku.primeNumberUptoN;

public class Main {
    public static void main(String[] args) {
        betterPrime(100);
    }

    public static void betterPrime(int n) {
        boolean[] array = new boolean[n + 1];
        int count = 0;

        for (int i = 2; i <Math.sqrt(n); i++) {
            if (!array[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    array[j] = true;
                    count++;
                }
            }
        }
//        System.out.println("count :" + count);

        for (int i = 2; i <= n; i++) {
            if (!array[i]) {
                System.out.println(i);
            }
        }
    }

    //Sieve of eratosthenes   TC = n(loglog(n))
    public static void optimalPrime(int n) {
        boolean[] array = new boolean[n + 1];
        int count = 0;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!array[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    array[j] = true;
                    count++;
                }
            }
        }
        System.out.println("count :" + count);


        for (int i = 2; i <= n; i++) {
            if (!array[i]) {
                System.out.println(i);
            }
        }
    }
}
