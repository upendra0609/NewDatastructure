package com.sikku.lcm;

public class Main {
    public static void main(String[] args) {
//        System.out.println(lcm(5,20));
        System.out.println(lcm(5,21));
//        System.out.println(lcm(10,10));
//        System.out.println(lcm(5,20));
//        System.out.println(lcm(5,20));
    }

    public static int lcm(int m, int n) {
        int num = m >= n ? m : n;
        int min = num;

        while (true) {
            if (num % m == 0 && num % n == 0) {
                return num;
            }
            num +=min;
        }
    }
}
