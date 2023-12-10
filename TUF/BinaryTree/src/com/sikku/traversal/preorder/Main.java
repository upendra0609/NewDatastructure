package com.sikku.traversal.preorder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }

    public void traverse(TreeNode root) {
        if (root == null) return;

        list.add(root.val);
        traverse(root.left);
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

