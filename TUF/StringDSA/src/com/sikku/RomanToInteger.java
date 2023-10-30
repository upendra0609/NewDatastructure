package com.sikku;

public class RomanToInteger {
    public static final int[] table = new int[256];

    static {
        table['I'] = 1;
        table['V'] = 5;
        table['X'] = 10;
        table['L'] = 50;
        table['C'] = 100;
        table['D'] = 500;
        table['M'] = 1000;
    }

    public static void main(String[] args) {
        System.out.println(romanToNum("IIV"));
    }

    public static int romanToNum(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'I' && i < n - 1) {
                char ch1 = s.charAt(i + 1);
                if (ch1 == 'V') {
                    sum += getInt("IV");
                    i++;
                } else if (ch1 == 'X') {
                    sum += getInt("IX");
                    i++;
                } else {
                    sum += getInt("I");
                }
                continue;
            } else if (ch == 'X' && i < n - 1) {
                char ch1 = s.charAt(i + 1);
                if (ch1 == 'L') {
                    sum += getInt("XL");
                    i++;
                } else if (ch1 == 'C') {
                    sum += getInt("XC");
                    i++;
                } else {
                    sum += getInt("X");
                }
                continue;
            } else if (ch == 'C' && i < n - 1) {
                char ch1 = s.charAt(i + 1);
                if (ch1 == 'D') {
                    sum += getInt("CD");
                    i++;
                } else if (ch1 == 'M') {
                    sum += getInt("CM");
                    i++;
                } else {
                    sum += getInt("C");
                }
                continue;
            }

            sum += getInt(String.valueOf(ch));
        }
        return sum;
    }

    public static int getInt(String s) {
        return switch (s) {
            case "I" -> 1;
            case "IV" -> 4;
            case "V" -> 5;
            case "IX" -> 9;
            case "X" -> 10;
            case "XL" -> 40;
            case "L" -> 50;
            case "XC" -> 90;
            case "C" -> 100;
            case "CD" -> 400;
            case "D" -> 500;
            case "CM" -> 900;
            default -> 1000;
        };
    }

    public static int best(String s) {
        int value = 0;
        int prev = 0;
        int current;
        for (char c : s.toCharArray()) {
            current = table[c];
            if (prev < current) {
                value -= prev + prev;
            }
            value += current;
            prev = current;
        }
        return value;
    }
}
