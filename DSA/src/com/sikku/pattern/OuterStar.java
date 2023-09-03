package com.sikku.pattern;

import java.util.Scanner;

public class OuterStar {

    /*
     ****
     *  *
     *  *
     ****
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        firstApproach(n);

    }

    public static void firstApproach(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void secondApproach(int n){
        for (int i=1 ; i<=n; i++){
            if(i==1 || i==n){
                int star = 1;
                while (star<=n){
                    System.out.print("*");
                    star++;
                }
            }else {
                System.out.print("*");
                //space
                int space = n-2;
                while (space>0){
                    System.out.print(" ");
                    space--;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
