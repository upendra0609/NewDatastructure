package com.sikku;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(getInt("I"));
        System.out.println(getInt("IV"));
    }

    public static int getInt(String s) {
        short i = 1;

        switch (i){
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }
}
