package com.sikku;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(getInt("I"));
        System.out.println(getInt("IV"));
    }

    public static int getInt(String s) {
        String i = "aa";

        switch (i){
            case "":
                return 1;
            case "a":
                return 2;
            default:
                return 3;
        }
    }
}
