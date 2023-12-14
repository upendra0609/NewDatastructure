package com.sikku.leetcodeBT.Pre_In_Post_inOneTraversal;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        root.left = n2;
        root.right = n5;
        n2.left = n3;
        n2.right = n4;
        n5.left = n6;
        n5.right = n7;
        findAll(root);

    }

    public boolean isBalanced(TreeNode root) {
        if (root.left != null && root.right != null) {
            return isBalanced(root.left) && isBalanced(root.right);

        } else {
            return true;
        }
    }


    public static void findAll(TreeNode root) {
        Stack<Entry> stack = new Stack<>();
        if (root == null) {
            return;
        }
        stack.push(new Entry(root, 1));
        ArrayList<Integer> preOrder = new ArrayList<>();
        ArrayList<Integer> inOrder = new ArrayList<>();
        ArrayList<Integer> postOrder = new ArrayList<>();

        while (!stack.isEmpty()) {
            Entry temp = stack.pop();
            if (temp.count == 1) {
                preOrder.add(temp.node.val);
                temp.count++;
                stack.push(temp);
                if (temp.node.left != null) {
                    stack.push(new Entry(temp.node.left, 1));
                }
            } else if (temp.count == 2) {
                inOrder.add(temp.node.val);
                temp.count++;
                stack.push(temp);
                if (temp.node.right != null) {
                    stack.push(new Entry(temp.node.right, 1));
                }
            } else {
                postOrder.add(temp.node.val);
                temp.count++;
            }
        }

        for (int i : preOrder) {
            System.out.print(i + ", ");
        }
        System.out.println("\n/////////////////////////");

        for (int i : inOrder) {
            System.out.print(i + ", ");
        }

        System.out.println("\n/////////////////////////");

        for (int i : postOrder) {
            System.out.print(i + ", ");
        }
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

@Data
@AllArgsConstructor
class Entry {
    public TreeNode node;
    public int count;
}
