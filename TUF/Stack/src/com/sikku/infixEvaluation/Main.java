package com.sikku.infixEvaluation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public static void infix(String str) {
        Stack<Character> operator = new Stack<>();
        Stack<Character> operands = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                operands.push(ch);
            }else {

            }
        }
    }
}
