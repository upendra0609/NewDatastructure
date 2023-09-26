package com.sikku.leapYear;

public class Main {
    public static void main(String[] args) {
        System.out.println(leapYear(100));
        System.out.println(leapYear(400));
        System.out.println(leapYear(2004));
    }

    public static boolean leapYear(int year) {
        boolean isLeap = true;

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                isLeap = false;
            }
        } else {
            isLeap = false;
        }
        return isLeap;
    }
}
