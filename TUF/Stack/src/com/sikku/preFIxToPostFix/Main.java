package com.sikku.preFIxToPostFix;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }
    public static String preToPost(String str) {
        Stack<String> stack = new Stack<>();
        int n = str.length();

        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                stack.push(Character.toString(ch));
            }else{
                String s1=  stack.pop();
                String s2=  stack.pop();
                stack.push(s1+s2+ch);
            }
        }
        return stack.pop();
    }
}
