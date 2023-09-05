package com.sikku;

public class HarshadNumber {
    public static void main(String[] args) {
        System.out.println(isHarshad(19));
    }

    public static boolean isHarshad(int num) {
        int sumDigit = digitSum(num);
        return num % sumDigit == 0;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
