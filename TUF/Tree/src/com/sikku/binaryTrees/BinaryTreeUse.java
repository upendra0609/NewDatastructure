package com.sikku.binaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    public static void main(String[] args) {
        /*BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
        root.right = node2;
        root.left = node1;*/
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println(countNode(root));

    }

    public static BinaryTreeNode<Integer> takeInput(Scanner sc) {
        System.out.println("Enter root data");
        int n = sc.nextInt();
        if (n == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int n = sc.nextInt();
        if (n == -1) {
            return null;
        }
        Queue<BinaryTreeNode<Integer>> remainingNode = new LinkedList<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
        remainingNode.add(root);
        while (!remainingNode.isEmpty()) {
            BinaryTreeNode<Integer> binaryNode = remainingNode.remove();
            System.out.println("Enter left child data of: " + binaryNode.data);
            int left = sc.nextInt();
            if (left != -1) {
                binaryNode.left = new BinaryTreeNode<>(left);
                remainingNode.add(binaryNode.left);
            }
            System.out.println("Enter right child data: " + binaryNode.data);
            int right = sc.nextInt();
            if (right != -1) {
                binaryNode.right = new BinaryTreeNode<>(right);
                remainingNode.add(binaryNode.right);
            }
        }
        return root;
    }

    public static void print(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String s = root.data + ": ";
        if (root.left != null) {
            s += "L:" + root.left.data;
        }
        if (root.right != null) {
            s += ", R:" + root.right.data;
        }
        System.out.println(s);
        print(root.left);
        print(root.right);
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<>();
        pendingNode.add(root);

        while (!pendingNode.isEmpty()) {
            BinaryTreeNode<Integer> bNode = pendingNode.remove();
            String s = bNode.data + ": ";
            if (bNode.left != null) {
                s += "L" + bNode.left.data;
                pendingNode.add(bNode.left);
            }
            if (bNode.right != null) {
                s += ",R" + bNode.right.data;
                pendingNode.add(bNode.right);
            }
            System.out.println(s);
        }
    }

    public static int countNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        count += countNode(root.left);
        count += countNode(root.right);
        return count;
    }
}
