package com.sikku.traversal.postorder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        traverse(root.right);
        list.add(root.val);

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


