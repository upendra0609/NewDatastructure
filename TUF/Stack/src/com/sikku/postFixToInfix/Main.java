package com.sikku.postFixToInfix;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(postToInfix("ABC/DA-*+"));
    }
    public static String postToInfix(String str) {
        Stack<String> operands = new Stack<>();

        int n = str.length();
        for(int i=0;i<n;i++){
            char ch =str.charAt(i);
            if(Character.isAlphabetic(ch)){
                operands.push(Character.toString(ch));
            }else{
                String s2 = operands.pop();
                String s1 = operands.pop();
                operands.push("("+s1+ch+s2+")");
            }
        }
        return operands.pop();
    }
}
