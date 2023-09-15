package com.sikku.stack.javastack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        int prevMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice \n1: push element\n2: pop element\n3: get maximum\nany other to exit\n");
        int choice = sc.nextInt();


        while (true) {

            if (choice == 1) {
                System.out.println("Enter number to push");
                int n = sc.nextInt();
                System.out.println(s.push(n) + " is pushed");
                if (max < n) {
                    prevMax = max;
                    max = n;
                }
            } else if (choice == 2) {
                if (s.isEmpty()) {
                    System.out.println("no element are present");
                } else {
                    if (max == s.peek()) {
                        max = prevMax;
                        System.out.println(s.pop() + " is removed");
                    }
                }
            } else if (choice == 3) {
                if (s.isEmpty()) {
                    System.out.println("no element are present");
                } else {
                    System.out.println("maximum number is :" + max);
                }
            } else {
                break;
            }
            System.out.println("Enter choice \n1: push element\n2: pop element\n3: get maximum\nany other to exit\n");
            choice = sc.nextInt();
        }
    }
}
