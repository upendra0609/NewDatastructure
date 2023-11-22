package com.sikku.postFixToPreFix;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }
    public static String postfixToPrefix(String str) {
        Stack<String> stack = new Stack<>();
        int n = str.length();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                stack.push(Character.toString(ch));
            }else{
                String s2=  stack.pop();
                String s1=  stack.pop();
                stack.push(ch+s1+s2);
            }
        }
        return stack.pop();
    }
}
