package com.sikku.divideTwoInteger;

public class Main {
    public static void main(String[] args) {
        int num = divideSelf(-2147483648, 2);
        System.out.println(num);
//        System.out.println(-(-2147483648));
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean negative = dividend < 0 ^ divisor < 0;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0, subQuot = 0;

        while (dividend - divisor >= 0) {
            for (subQuot = 0; dividend - (divisor << subQuot << 1) >= 0; subQuot++) ;

            quotient += 1 << subQuot;
            dividend -= divisor << subQuot;
        }
        System.out.print(quotient);
        System.out.println(negative);
        return negative ? -quotient : quotient;
    }

    public static int divideSelf(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean isNegative = dividend < 0 ^ divisor < 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result = 0;

        while (dividend - divisor >= 0) {
            int x = 0;
            while (((long) divisor << x) <= dividend) {
                x++;
            }
            dividend -= (divisor << (x - 1));
            result += 1 << (x - 1);
        }

        System.out.println(result);
        return isNegative ? -result : result;
    }
}
