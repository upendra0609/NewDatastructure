package com.sikku.totalSetBit;

public class WithoutArray {
    public static void main(String[] args) {
        System.out.println(countSetBits(11));
    }

    public static int countSetBits(int n) {
        if (n == 0) return 0;

        int x = maxPower(n);
        int btill2x = x * (1 << (x - 1));
        int extra = n - (1 << x) + 1;     //extra 1(bit) after max power of 2
        int rest = n - (1 << x);         // rest number after max power 2
        return btill2x + extra + countSetBits(rest);

    }

    private static int maxPower(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }

        return x - 1;
    }
}
