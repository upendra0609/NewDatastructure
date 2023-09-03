package com.sikku.pattern;

public class BlankPyramid {
    public static void main(String[] args) {
        pattern(5);
        pattern(7);
        pattern(4);
        pattern(10);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
            } else {
                //space
                for (int j = i - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                //star
                System.out.print("*");
                //space
                for (int j = 2 * (n - i) - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                if(i<n){
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
