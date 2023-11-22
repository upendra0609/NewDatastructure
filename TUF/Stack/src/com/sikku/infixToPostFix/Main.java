package com.sikku.infixToPostFix;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public static String infixToPostfix(String str) {
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
        return operands.pop();
    }

    private static String solve(String a, String b, char oprtr) {
        return a + b + oprtr;
    }

    private static int precedence(char ch) {
        if(ch=='^'){
            return 3;
        }else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 2;
        }
    }
}
