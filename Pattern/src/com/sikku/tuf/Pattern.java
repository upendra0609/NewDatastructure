package com.sikku.tuf;

public class Pattern {
    public static void main(String[] args) {
        blankContainer(5);
        blankContainer(6);
    }

    public static void triangle1(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //star
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void triangle2(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void symmetryTriangle(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void patternBinary(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    public static void blankContainer(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 1;

            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
            }
            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(--count);
            }
            System.out.println();
        }
    }

    
}
