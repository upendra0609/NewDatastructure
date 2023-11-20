package com.sikku.problems.balancedParentheses;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("()}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(stack.isEmpty() || stack.pop()!='('){
                    return false;
                }
            }else if(s.charAt(i)=='}'){
                if(stack.isEmpty() || stack.pop()!='{'){
                    return false;
                }
            }else if(s.charAt(i)==']'){
                if(stack.isEmpty() || stack.pop()!='['){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
