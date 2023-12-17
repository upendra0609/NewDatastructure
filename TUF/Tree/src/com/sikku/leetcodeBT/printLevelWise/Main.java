package com.sikku.leetcodeBT.printLevelWise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(2);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        node1.left = node5;
        node1.right = node6;

        List<List<Integer>> l = printLevel(root);

        for (var i : l) {
            System.out.print(i + ", ");
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
                if (index % 2 != 0) {
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

    public static List<List<Integer>> printLevel(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<TreeNode> tempList = new ArrayList<>();
            while (!queue.isEmpty()) {
                tempList.add(queue.remove());
            }
            List<Integer> temp = new ArrayList<>();
            for (TreeNode n : tempList) {
                temp.add(n.val);
                if (n.right != null) {
                    queue.offer(n.right);
                }
                if (n.left != null) {
                    queue.offer(n.left);
                }
//                } else {
                    /*if (n.left != null) {
                        queue.offer(n.left);
                    }
                    if (n.right != null) {
                        queue.offer(n.right);
                    }*/
//                }
            }
            if (index % 2 == 0) {
                Collections.reverse(temp);
            }
            index++;
            list.add(temp);
        }
        return list;
    }
}
