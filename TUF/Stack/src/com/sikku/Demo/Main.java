package com.sikku.Demo;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        StackUsingArray<Integer> stack = new StackUsingArray<>();

//        System.out.println(stack.push(12));
//        System.out.println(stack.push(12));
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}
