package com.sikku.pattern;

public class InvertDiamond {
    public static void main(String[] args) {
        pattern(5);
        pattern(3);
    }
    public static void pattern(int n){
        for (int i=1; i<=2*n-1; i++){
            //upper
            if(i<=n){
                //space
                for (int j=i-1; j>0; j--){
                    System.out.print(" ");
                }
                //star
                for (int j=2*(n-i)+1; j>0; j--){
                    System.out.print("*");
                }
            }else {
                //space
                for (int j=2*n -i-1; j>0; j--) {
                    System.out.print(" ");
                }
                //star
                for (int j=2*(i-n)+1; j>0; j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
