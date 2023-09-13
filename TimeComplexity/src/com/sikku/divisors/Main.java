package com.sikku.divisors;

public class Main {
    public static void main(String[] args) {
//        divisors(24);

        System.out.println(countDivisors(100));
        System.out.println(countDivisors(0));
        System.out.println(countDivisors(-10));
    }

    public static void divisors(int num) {
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print(num);
    }

    public static int countDivisors(int num) {
        if(num <=0){
            return 0;
        }
        int count = 1;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                count +=2;
            }
        }
        return count;
    }
}
