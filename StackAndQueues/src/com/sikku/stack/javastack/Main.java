package com.sikku.stack.javastack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        int prevMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        int choice = sc.nextInt();

        while (choice != -1) {

            if (choice == 1) {
                System.out.println("Enter number to push");
                int n = sc.nextInt();
                System.out.println(s.push(n)+" is pushed");
                if (max < n) {
                    prevMax = max;
                    max = n;
                }
            } else if (choice == 2) {
                if (max == s.peek()) {
                    max = prevMax;
                    System.out.println(s.pop()+" is removed");
                }
            } else if (choice == 3) {
                System.out.println("maximum number is :"+max);
            } else {
                break;
            }
            System.out.println("Enter choice");
            choice = sc.nextInt();

        }
    }
}
