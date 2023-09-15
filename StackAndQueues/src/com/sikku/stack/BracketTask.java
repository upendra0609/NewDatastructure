package com.sikku.stack;

import java.util.Stack;

public class BracketTask {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
//        String str = "{[]{(){}}()[]}";
        String str = "{()()(){}[]}";
        char[] c = str.toCharArray();

        for (char cr : c) {
            if (cr == '(' || cr == '{' || cr == '[') {
                st.push(cr);
            } else {
                if (cr == ')' && st.peek() == '(') {
                    st.pop();
                } else if (cr == '}' && st.peek() == '{') {
                    st.pop();
                } else if (cr == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    break;
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
