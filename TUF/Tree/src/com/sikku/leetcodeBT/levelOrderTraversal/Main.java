package com.sikku.leetcodeBT.levelOrderTraversal;

import java.util.*;


public class Main {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> remainingNode = new LinkedList<>();
        remainingNode.add(root);

        while (!remainingNode.isEmpty()) {
            int n = remainingNode.size();
            TreeNode[] array = new TreeNode[n];
            for (int i = 0; i < n; i++) {
                array[i] = remainingNode.remove();
            }
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode tempNode = array[i];
                levelList.add(tempNode.val);
                if (tempNode.left != null) {
                    remainingNode.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    remainingNode.add(tempNode.right);
                }
            }
            list.add(levelList);
        }
        return list;
    }

    public List<List<Integer>> levelOrderBetter(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> remainingNode = new LinkedList<>();
        remainingNode.add(root);

        while (!remainingNode.isEmpty()) {
            int n = remainingNode.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (remainingNode.peek().left != null) {
                    remainingNode.add(remainingNode.peek().left);
                }
                if (remainingNode.peek().right != null) {
                    remainingNode.add(remainingNode.peek().right);
                }
                levelList.add(remainingNode.remove().val);
            }
            list.add(levelList);
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
