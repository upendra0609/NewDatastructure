package com.sikku.preFixToInfix;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public static String prefixToInfixConversion(String str) {
        Stack<String> operands = new Stack<>();

        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                operands.push(Character.toString(ch));
            } else {
                String s1 = operands.pop();
                String s2 = operands.pop();
                operands.push("(" + s1 + ch + s2 + ")");
            }
        }
        return operands.pop();
    }
}
