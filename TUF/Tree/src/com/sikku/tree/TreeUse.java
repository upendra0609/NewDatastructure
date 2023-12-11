package com.sikku.tree;

import java.util.Scanner;

public class TreeUse {
    public static void main(String[] args) {
        /*TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(4);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node3.children.add(node5);
        System.out.println(root);*/
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        print(root);
    }

    public static TreeNode<Integer> takeInput(Scanner sc) {
        int n;
        System.out.println("Enter Next Node data: ");
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for " + n);
        int childrenCount = sc.nextInt();
        for (int i = 0; i < childrenCount; i++) {
            TreeNode<Integer> node = takeInput(sc);
            root.children.add(node);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        StringBuilder s = new StringBuilder(root.data + ": ");
        for (TreeNode<Integer> i : root.children) {
            s.append(i.data).append(", ");
        }
        System.out.println(s);

        for (TreeNode<Integer> i : root.children) {
            print(i);
        }
    }
}
