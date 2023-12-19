package com.sikku.leetcodeBT.verticalTraversal;

import com.sikku.leetcodeBT.TreeNode;

import java.util.*;
import java.util.stream.Stream;

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
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        List<List<Integer>> lists = verticalTraversal(root);
        System.out.println(lists);
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        HashMap<TreeNode, Integer> hash = new HashMap<>();
        hash.put(root, 0);
        preOrder(root, hash);



        TreeMap<Integer, List<Integer>> h1 = new TreeMap<>(Integer::compare);

        Stream.of(hash).forEach(entry -> entry.forEach((key, value) -> {
            if (h1.containsKey(value)) {
                h1.get(value).add(key.val);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(key.val);
                h1.put(value, temp);
            }
        }));

        Stream.of(h1).forEach(i ->
                        i.forEach((key, value) -> {
                            ans.add(value);
                        })
        );
        return ans;
    }

    public static void preOrder(TreeNode root, HashMap<TreeNode, Integer> hash) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            hash.put(root.left, hash.get(root) - 1);
            preOrder(root.left, hash);
        }
        if (root.right != null) {
            hash.put(root.right, hash.get(root) + 1);
            preOrder(root.right, hash);
        }
    }
}
