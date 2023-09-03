package com.sikku.pattern;

public class Diamond {
    public static void main(String[] args) {
        pattern2(5);
//        System.out.println("////////////////////////");
        pattern2(4);
    }

    public static void pattern(int n) {
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

        //second part
        n -= 1;
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            //star
            for (int j = 2 * (n - i) + 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n){
        for (int i=1; i<=2*n -1; i++){
            if(i<=n){
                //space
                for (int j=n; j>i; j--){
                    System.out.print(" ");
                }
                //star
                for (int j=2*i-1; j>0; j--){
                    System.out.print("*");
                }
            } else {
                //space
                for (int j=i-n; j>0; j--){
                    System.out.print(" ");
                }

                //star
                for (int j= 2*(2*n-i)-1; j>0; j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
