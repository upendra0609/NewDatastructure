package com.sikku.Demo;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        StackUsingLinkedListBest<Integer> stack = new StackUsingLinkedListBest<>();
        StackUsingLinkedListBest<Integer> helper = new StackUsingLinkedListBest<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverse(stack, helper);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void reverse(StackUsingLinkedListBest<Integer> s1, StackUsingLinkedListBest<Integer> helper) throws Exception {
        reverse1(s1, helper);
    }

    public static void reverse1(StackUsingLinkedListBest<Integer> s1, StackUsingLinkedListBest<Integer> helper) throws Exception {
        if (s1.size() == 0) {
            return;
        }


        while (!s1.isEmpty()) {
            int x = s1.pop();
            reverse1(s1, helper);
            helper.push(x);
        }

        while (!helper.isEmpty()) {
            s1.push(helper.pop());
        }
    }
}
