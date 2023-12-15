package com.sikku.leetcodeBT.maxPathSum;

public class Main {

    public static class TreeNode {
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

    private int max = -1001;

    public int maxPathSum(TreeNode root) {
        int temp = maxm(root);
        return Math.max(temp, max);
    }

    public int maxm(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lAns = Math.max(0, maxm(root.left));
        int rAns = Math.max(0, maxm(root.right));
        max = Math.max(max, lAns + rAns + root.val);
        return (root.val + Math.max(lAns, rAns));
    }
}
