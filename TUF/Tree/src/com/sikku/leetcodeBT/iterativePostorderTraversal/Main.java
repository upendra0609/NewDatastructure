package com.sikku.leetcodeBT.iterativePostorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> tempStack = new Stack<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        tempStack.push(root);

        while (!tempStack.isEmpty()) {
            TreeNode node = tempStack.pop();
            stack.push(node);
            if (node.left != null) {
                tempStack.push(node.left);
            }
            if (node.right != null) {
                tempStack.push(node.right);
            }
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
        return list;
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
