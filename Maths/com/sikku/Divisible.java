package com.sikku;

public class Divisible {
    public static void main(String[] args) {
        int num = 1000;
        int i =3;
        int j =5;
        int count = countDivisible(num,i) + countDivisible(num, j) - countDivisible(num,i*j);
        System.out.println(count);
    }

    public static int countDivisible(int num, int n) {
        return num / n;
    }
}
