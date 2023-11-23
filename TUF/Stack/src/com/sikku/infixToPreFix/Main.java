package com.sikku.infixToPreFix;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        infix("2+(5-3*6/2)");
        infix("a+b+c+d-e");
    }

    public static void infix(String str) {
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch) || Character.isAlphabetic(ch)) {
                operands.push(Character.toString(ch));
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    String b = operands.pop();
                    String a = operands.pop();
                    char oprtr = operators.pop();
                    String ans = solve(a, b, oprtr);
                    operands.push(ans);
                }
                operators.pop();
            } else {
                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
                    String b = operands.pop();
                    String a = operands.pop();
                    char oprtr = operators.pop();
                    String ans = solve(a, b, oprtr);
                    operands.push(ans);
                }
                operators.push(ch);

            }
        }

        while (operators.size() > 0) {
            String b = operands.pop();
            String a = operands.pop();
            char oprtr = operators.pop();
            String ans = solve(a, b, oprtr);
            operands.push(ans);
        }
        System.out.println(operands.pop());
    }

    private static String solve(String a, String b, char oprtr) {
        return oprtr + a + b;
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 2;
        }
    }
}
