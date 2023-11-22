package com.sikku.infixEvaluation;

import java.util.Stack;

public class CodeNinja {
    public static void main(String[] args) {
        infix("2+(5-3*6/2)");
    }

    public static void infix(String str) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                operands.push(ch - '0');
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    int b = operands.pop();
                    int a = operands.pop();
                    char oprtr = operators.pop();
                    int ans = solve(a, b, oprtr);
                    operands.push(ans);
                }
                operators.pop();
            } else {
                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
                    int b = operands.pop();
                    int a = operands.pop();
                    char oprtr = operators.pop();
                    int ans = solve(a, b, oprtr);
                    operands.push(ans);
                }
                operators.push(ch);

            }
        }

        while (operators.size() > 0) {
            int b = operands.pop();
            int a = operands.pop();
            char oprtr = operators.pop();
            int ans = solve(a, b, oprtr);
            operands.push(ans);
        }
        System.out.println(operands.pop());
    }

    private static int solve(int a, int b, char oprtr) {
        if (oprtr == '+') {
            return a + b;
        } else if (oprtr == '-') {
            return a - b;
        } else if (oprtr == '*') {
            return a * b;
        } else {
            return a / b;
        }
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 2;
        }
    }
}
