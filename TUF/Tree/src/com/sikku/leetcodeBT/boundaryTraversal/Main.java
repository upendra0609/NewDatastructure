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

    }

    public static List<Integer> traverse(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        TreeNode leftNode = root;

        while (leftNode != null) {
            if (root.left == null && root.right == null) {
                break;
            } else {
                list.add(leftNode.val);
            }
            if (leftNode.left != null) {
                leftNode = leftNode.left;
            } else if (leftNode.right != null) {
                leftNode = leftNode.right;
            }
        }

        return list;
    }
}
