package com.sikku.stack;

import java.util.Stack;

public class StringTask {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        String str = "Shrashti teaches DSA";
        String[] array = str.split(" ");

        for (String s : array) {
            st.push(s);
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop()+" ");
        }
    }
}
