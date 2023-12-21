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
//        printLevelWise(root);
//        System.out.println(countNode(root));
//        System.out.println(diameter(root));
//        inOrderPrint(root);
//        removeLeafNode(root);
//        printLevelWise(root);
//
//        mirrorBinary(root);
//        printLevelWise(root);

        System.out.println(isBalance(root));

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

    /*T.C.=> O(n*h)*/
    public static int diameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(Math.max(option2, option3), option1);
    }

    public static int diameterOptimal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int[] maxDia = new int[1];
        maxDia[0] = Math.max(maxDia[0], height(root, maxDia));
        return maxDia[0];
    }

    public static int height(BinaryTreeNode<Integer> root, int[] max) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left, max);
        int rh = height(root.right, max);
        max[0] = Math.max(max[0], lh + rh);
        return Math.max(lh, rh) + 1;
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static void inOrderPrint(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        inOrderPrint(root.left);
        System.out.println(root.data);
        inOrderPrint(root.right);
    }

    public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        } else if ((root.left == null && root.right == null)) {
            return null;
        }

        root.left = removeLeafNode(root.left);
        root.right = removeLeafNode(root.right);
        return root;
    }

    public static void mirrorBinary(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        mirrorBinary(root.left);
        mirrorBinary(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static boolean isBalance(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        if ((root.left == null && root.right != null) || (root.right == null && root.left != null)) {
            return false;
        }

        return isBalance(root.left) && isBalance(root.right);
    }
}
