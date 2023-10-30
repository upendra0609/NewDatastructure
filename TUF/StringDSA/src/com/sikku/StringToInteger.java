package com.sikku;

import java.math.BigInteger;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483647"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        if (n == 0) return 0;


        long result = 0;
        boolean isNegative = false;
        int index = 0;
        if (s.charAt(index) == '-') {
            isNegative = true;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        while (index < n && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            index++;
            if (isNegative && result >= (long) Integer.MIN_VALUE * (-1)) {
                return Integer.MIN_VALUE;
            } else if (!isNegative && result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return isNegative ? (int) -result : (int) result;
    }
}
