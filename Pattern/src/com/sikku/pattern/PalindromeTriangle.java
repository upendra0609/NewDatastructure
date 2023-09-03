package com.sikku.pattern;

public class PalindromeTriangle {
    public static void main(String[] args) {
        pattern2(3);
        pattern2(6);
    }

    /*
    A
    ABA
    ABCBA
    ABCDCBA
    ABCDEDCBA
     */
    public static void pattern(int n) {
        for (int i=1; i<=n; i++){
            char ch = 'A';
            //forward
            for (int j=1; j<=i; j++){
                System.out.print(ch++);
            }

            //backward
            ch--;
            for (int j=1; j<i; j++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int i=1; i<=n; i++){
            char ch ='A'-1;
            for (int j=1; j<=2*i -1; j++){
                if(j<=i){
                    System.out.print(++ch +" ");
                } else {
                    System.out.print(--ch +" ");
                }
            }
            System.out.println();
        }
    }
}
