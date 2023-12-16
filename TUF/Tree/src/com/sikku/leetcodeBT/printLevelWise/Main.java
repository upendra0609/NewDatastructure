package com.sikku.leetcodeBT.printLevelWise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        List<List<Integer>> l = print(root);

        for (var i : l) {
            for (var j : i) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> print(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        int index = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        index++;


        while (!queue.isEmpty()) {
            List<TreeNode> tempList = new ArrayList<>();
            List<Integer> l = new ArrayList<>();
            while (!queue.isEmpty()) {
                tempList.add(queue.remove());
            }
            for (TreeNode n : tempList) {
                l.add(n.val);
                if (index % 2 == 0) {
                    if (n.right != null) {
                        queue.offer(n.right);
                    }
                    if (n.left != null) {
                        queue.offer(n.left);
                    }
                } else {
                    if (n.left != null) {
                        queue.offer(n.left);
                    }
                    if (n.right != null) {
                        queue.offer(n.right);
                    }
                }
                index++;
            }
            list.add(l);
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
