package com.sikku.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
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
//        TreeNode<Integer> root = takeInput(sc);

        TreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println("////////////");
//        System.out.println("Node count: " + numNodes(root));
//        System.out.println("largest node: " + largest(root));
        System.out.println("Height: " + height(root));
    }

    public static int height(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int height = 0;
        for (TreeNode<Integer> i : root.children) {
            height = Math.max(height, height(i));
        }
        return height + 1;
    }

    public static int numNodes(TreeNode<Integer> root) {
        //this is not a base case this is edge case
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (TreeNode<Integer> i : root.children) {
            count += numNodes(i);
        }
        return count;
    }

    public static int largest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (TreeNode<Integer> i : root.children) {
            int childLargest = largest(i);
            ans = Math.max(ans, childLargest);
        }
        return ans;
    }

    public static TreeNode<Integer> takeInputLevelWise() {
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> frontNode = pendingNodes.remove();
            System.out.println("Enter num of children of " + frontNode.data);
            int numChildren = sc.nextInt();
            for (int i = 0; i < numChildren; i++) {
                System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> node = pendingNodes.remove();
            System.out.print(node.data + ": ");
            for (TreeNode<Integer> i : node.children) {
                System.out.print(i.data + ", ");
                pendingNodes.add(i);
            }
            System.out.println();
        }
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
