package com.sikku.leetcodeBT.boundaryTraversal;

import com.sikku.leetcodeBT.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(6);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(8);
        TreeNode n8 = new TreeNode(9);
        TreeNode n9 = new TreeNode(10);
        TreeNode n10 = new TreeNode(11);

        root.left = n1;
        root.right = n6;
        n1.left = n2;
        n2.right = n3;
        n3.left = n4;
        n3.right = n5;
        n6.right = n7;
        n7.left = n8;
        n8.right = n10;
        n8.left = n9;

        traverse(root);

    }

    public static List<Integer> traverse(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);

        TreeNode leftNode = root.left;
        //Left traversal
        while (leftNode.left != null || leftNode.right != null) {
            list.add(leftNode.val);
            if (leftNode.left != null) {
                leftNode = leftNode.left;
            } else {
                leftNode = leftNode.right;
            }
        }

        //leaf node
        leafNode(root, list);

        //right traversal
        TreeNode rightNode = root.right;
        Stack<Integer> stack = new Stack<>();

        while (rightNode.right != null || rightNode.left != null) {
            stack.add(rightNode.val);
            if (rightNode.right != null) {
                rightNode = rightNode.right;
            } else {
                rightNode = rightNode.left;
            }
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        System.out.println(list);
        return list;
    }

    private static void leafNode(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        leafNode(root.left, list);
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        leafNode(root.right, list);
    }
}
