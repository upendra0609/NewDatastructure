package com.sikku.primeFactorSieve;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        countPrimes(10);
    }

    public static List<Integer> countPrimes(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                if (!list.contains(i)) {
                    list.add(i);
                }
                n /= i;
            }
        }

        if (n > 1 & !list.contains(n)) {
            list.add(n);
        }

        return list;
    }
}
