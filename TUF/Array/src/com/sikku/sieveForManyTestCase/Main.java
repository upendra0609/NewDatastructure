package com.sikku.sieveForManyTestCase;

public class Main {
    public static void main(String[] args) {
        primeFactor(100);
    }

    public static int primeFactor(int n) {
        int[] array = createSieve();

        while (n != 1) {
            System.out.print(array[n]+" ");
            n /= array[n];
        }
        return 0;
    }

    public static int[] createSieve() {
        int n = 1000000;
        //n<=10^6 constraints
        int[] array = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            array[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (array[i] == i) {
                for (int j = i * i; j <= n; j = j + i) {
                    if (array[j] == j) {
                        array[j] = i;
                    }
                }
            }
        }
        return array;
    }
}
