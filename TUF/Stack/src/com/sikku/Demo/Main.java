package com.sikku.Demo;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        StackUsingLinkedListBest<Integer> stack = new StackUsingLinkedListBest<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
