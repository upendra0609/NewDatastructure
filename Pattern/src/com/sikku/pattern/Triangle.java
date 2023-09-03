package com.sikku.pattern;

public class Triangle {
    public static void main(String[] args) {
        int n = 5;
        pattern5(n);
    }

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            int space = n - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            //star
            int star = i;
            while (star > 0) {
                System.out.print("*");
                star--;
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            //number
            int count = 1;
            for (int j = i; j > 0; j--) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            //number
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            //star
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}