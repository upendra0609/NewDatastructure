package com.sikku.traversal.inorder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
