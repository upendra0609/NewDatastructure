package com.sikku.problem.missingAndRepeatingNumber;

public class Main {
    public static void main(String[] args) {
        int[] ar = {4, 3, 6, 2, 1, 1};
        missing(ar);
    }

    public static void missing(int[] array) {
        //repeating
        int x = 0;
        //missing
        int y = 0;
        //sum of all array element
        long s = 0;
        //sum of square of all element
        long s2 = 0;
        //sum of all natural number
        long sn = 0;
        //sum of square of all natural number
        long sn2 = 0;

        for (int i = 1; i <= array.length; i++) {
            s += array[i - 1];
            s2 += Math.pow(array[i - 1], 2);
            sn += i;
            sn2 += Math.pow(i, 2);
        }

        x = (int) ((s2 - sn2) / (s - sn) + (s - sn));
        x /= 2;
        y = (int) (x - (s - sn));
        System.out.println(x + "  " + y);
    }
}
