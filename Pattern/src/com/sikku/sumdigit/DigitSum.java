package com.sikku.sumdigit;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit("1230657480"));
    }

    public static int sumDigit(int num){

        int sum =0;
        while (num>0){
            sum += num %10;
            num /=10;
        }
        return sum;
    }

    public static int sumDigit(String num){

        int sum =0;
        for (int i=0 ;i<num.length(); i++){
            sum += num.charAt(i) - '0';
        }
        return sum;
    }
}
